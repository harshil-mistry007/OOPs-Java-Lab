import java.io.*;

public class Q6 {
    public static void main(String[] args) {
        try {
            BufferedReader br = new BufferedReader(new FileReader("sdj.txt"));
            String line;
            StringBuilder content = new StringBuilder();

            while ((line = br.readLine()) != null) {
                line = line.replace("his", "her");
                content.append(line).append("\n");
            }
            br.close();

            // write back to file
            BufferedWriter bw = new BufferedWriter(new FileWriter("sdj.txt"));
            bw.write(content.toString());
            bw.close();

            System.out.println("Replacement done.");
        } catch (IOException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}