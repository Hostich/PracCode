import java.util.*;

class ClockPageReplacement {
    private int frames;
    private int[] pageFrame;
    private boolean[] referenceBit;
    private int pointer;

    public ClockPageReplacement(int frames) {
        this.frames = frames;
        this.pageFrame = new int[frames];
        this.referenceBit = new boolean[frames];
        this.pointer = 0;
        Arrays.fill(pageFrame, -1); // Initialize frame with -1 (empty)
    }

    public int execute(int[] pages) {
        int pageFaults = 0;

        for (int page : pages) {
            if (!isPageInFrame(page)) { // Page fault occurs
                pageFaults++;
                replacePage(page);
            }
        }
        return pageFaults;
    }

    private boolean isPageInFrame(int page) {
        for (int i = 0; i < frames; i++) {
            if (pageFrame[i] == page) {
                referenceBit[i] = true; // Mark as recently used
                return true;
            }
        }
        return false;
    }

    private void replacePage(int page) {
        while (true) {
            if (!referenceBit[pointer]) { // If reference bit is 0, replace
                pageFrame[pointer] = page;
                referenceBit[pointer] = true; // Mark as recently used
                pointer = (pointer + 1) % frames;
                break;
            } else { // If reference bit is 1, give second chance and move pointer
                referenceBit[pointer] = false;
                pointer = (pointer + 1) % frames;
            }
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter number of frames: ");
        int frames = scanner.nextInt();
        System.out.print("Enter number of pages: ");
        int numPages = scanner.nextInt();
        
        int[] pages = new int[numPages];
        System.out.println("Enter page reference string: ");
        for (int i = 0; i < numPages; i++) {
            pages[i] = scanner.nextInt();
        }
        
        ClockPageReplacement clock = new ClockPageReplacement(frames);
        int faults = clock.execute(pages);
        
        System.out.println("Total Page Faults: " + faults);
        scanner.close();
    }
}
