public class FileDownload {
    public static void main(String[] args) {
        Thread part1 = new Thread(() -> {
            System.out.println("Part 1 downloading...");
            try { Thread.sleep(1000); } catch (InterruptedException e) {}
            System.out.println("Part 1 completed.");
        });

        Thread part2 = new Thread(() -> {
            System.out.println("Part 2 downloading...");
            try { Thread.sleep(1000); } catch (InterruptedException e) {}
            System.out.println("File download completed.");
        });

        part1.start();
        try { part1.join(); } catch (InterruptedException e) {}
        part2.start();
    }
}