import java.io.File;

public class SimpleFileManager {
    public static void main(String[] args) {
        String directoryPath = System.getProperty("user.home") + File.separator + "Desktop";
        File directory = new File(directoryPath);

        if (directory.exists() && directory.isDirectory()) {
            File[] filesAndDirs = directory.listFiles();

            if (filesAndDirs != null) {
                System.out.println("Files and Directories on the Desktop:");
                for (File fileOrDir : filesAndDirs) {
                    if (fileOrDir.isDirectory()) {
                        System.out.println("Directory: " + fileOrDir.getName());
                    } else {
                        System.out.println("File: " + fileOrDir.getName());
                    }
                }
            } else {
                System.out.println("No files or directories found on the Desktop.");
            }
        } else {
            System.out.println("Desktop directory does not exist.");
        }
    }
}
