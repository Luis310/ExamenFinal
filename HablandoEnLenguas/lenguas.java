
import java.io.*;
public class lenguas {

    public static void main(String[] args) throws IOException {
        File f;
        f = new File(args[0], "lenguas_201213181.txt");
        FileWriter w = new FileWriter(f, true);
        BufferedWriter bw = new BufferedWriter(w);
        BufferedReader bf = null;
        try {
            bf = new BufferedReader(new FileReader(args[0]));
        } catch (FileNotFoundException q) {
            q.printStackTrace();
        }
        try {
            int numerolineas = Integer.parseInt(bf.readLine());

            for (int m = 0; m < numerolineas; m++) {
                String lector = bf.readLine();
                String atributos[] = lector.split(" ");

                for (int j = 0; j < atributos.length; j++) {
                    char[] separacion = atributos[j].toCharArray();

                    for (int i = 0; i < separacion.length; i++) {
                        if (separacion[i] == 'a') {
                            separacion[i] = 'y';
                        } else if (separacion[i] == 'b') {
                            separacion[i] = 'h';
                        } else if (separacion[i] == 'c') {
                            separacion[i] = 'e';
                        } else if (separacion[i] == 'd') {
                            separacion[i] = 's';
                        } else if (separacion[i] == 'e') {
                            separacion[i] = 'o';
                        } else if (separacion[i] == 'f') {
                            separacion[i] = 'c';
                        } else if (separacion[i] == 'g') {
                            separacion[i] = 'v';
                        } else if (separacion[i] == 'h') {
                            separacion[i] = 'x';
                        } else if (separacion[i] == 'i') {
                            separacion[i] = 'd';
                        } else if (separacion[i] == 'j') {
                            separacion[i] = 'u';
                        } else if (separacion[i] == 'k') {
                            separacion[i] = 'i';
                        } else if (separacion[i] == 'l') {
                            separacion[i] = 'g';
                        } else if (separacion[i] == 'm') {
                            separacion[i] = 'l';
                        } else if (separacion[i] == 'n') {
                            separacion[i] = 'b';
                        } else if (separacion[i] == 'o') {
                            separacion[i] = 'k';
                        } else if (separacion[i] == 'p') {
                            separacion[i] = 'r';
                        } else if (separacion[i] == 'q') {
                            separacion[i] = 'z';
                        } else if (separacion[i] == 'r') {
                            separacion[i] = 't';
                        } else if (separacion[i] == 's') {
                            separacion[i] = 'n';
                        } else if (separacion[i] == 't') {
                            separacion[i] = 'w';
                        } else if (separacion[i] == 'u') {
                            separacion[i] = 'j';
                        } else if (separacion[i] == 'v') {
                            separacion[i] = 'p';
                        } else if (separacion[i] == 'w') {
                            separacion[i] = 'f';
                        } else if (separacion[i] == 'x') {
                            separacion[i] = 'm';
                        } else if (separacion[i] == 'y') {
                            separacion[i] = 'a';
                        }

                        bw.write(separacion[i]);
                    }
                    System.out.print(" ");
                    bw.write(" ");
                }
                System.out.println();
                bw.newLine();
            }
            bw.close();
        } catch (Exception d) {
            System.out.println("");
        }

    }
}