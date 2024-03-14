

class cgpa{
    public static void main(String arg[]) {
        int n = 5;
        double m[] = new double[n];
        double g[] = new double[n];
        double cgpa, sum = 0;

        // Assuming sample marks for 5 subjects
        m[0] = 95;
        m[1] = 85;
        m[2] = 80;
        m[3] = 83;
        m[4] = 95;

        for (int i = 0; i < n; i++) {
            g[i] = (m[i] / 10);
        }

        for (int i = 0; i < n; i++) {
            sum += g[i];
        }

        cgpa = sum / n;
        System.out.println("CGPA: " + cgpa);
        System.out.println("Percentage from CGPA: " + cgpa * 9.5);
    }
}
