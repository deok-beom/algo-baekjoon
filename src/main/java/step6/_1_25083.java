// https://www.acmicpc.net/problem/25083
package step6;

import java.io.BufferedWriter;
import java.io.IOException;
import java.io.OutputStreamWriter;

public class _1_25083 {
    public static void main(String[] args) throws IOException {
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        bw.write(String.format("         ,r'\"7%s", System.lineSeparator()));
        bw.write(String.format("r`-_   ,'  ,/%s", System.lineSeparator()));
        bw.write(String.format(" \\. \". L_r'%s", System.lineSeparator()));
        bw.write(String.format("   `~\\/%s", System.lineSeparator()));
        bw.write(String.format("      |%s", System.lineSeparator()));
        bw.write(String.format("      |%s", System.lineSeparator()));
        bw.flush();
        bw.close();
    }
}
