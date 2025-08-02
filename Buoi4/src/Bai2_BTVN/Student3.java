package Bai2_BTVN;

public class Student3 {
        private String name;
        private int birthYear;
        private String address;
        private double tx1;
        private double tx2;
        private double kthp;
        private int absentDays;

        public Student3(String name, int birthYear, String address, double tx1, double tx2, double kthp, int absentDays) {
            this.name = name;
            this.birthYear = birthYear;
            this.address = address;
            this.tx1 = tx1;
            this.tx2 = tx2;
            this.kthp = kthp;
            this.absentDays = absentDays;
        }

        public String getName() { return name; }
        public int getBirthYear() { return birthYear; }
        public String getAddress() { return address; }
        public double getTx1() { return tx1; }
        public double getTx2() { return tx2; }
        public double getKthp() { return kthp; }
        public int getAbsentDays() { return absentDays; }

        public void setName(String name) { this.name = name; }
        public void setBirthYear(int birthYear) { this.birthYear = birthYear; }
        public void setAddress(String address) { this.address = address; }
        public void setTx1(double tx1) { this.tx1 = tx1; }
        public void setTx2(double tx2) { this.tx2 = tx2; }
        public void setKthp(double kthp) { this.kthp = kthp; }
        public void setAbsentDays(int absentDays) { this.absentDays = absentDays; }

        public int getAge(int currentYear) {
            return currentYear - birthYear;
        }

        public double getGPA() {
            return tx1 * 0.2 + tx2 * 0.3 + kthp * 0.5;
        }

        public void printRow(int currentYear) {
            System.out.printf("%-15s %-6d %-15s %-10.2f %-10.2f %-12.2f %-10.2f %-12d\n",
                    name, getAge(currentYear), address, tx1, tx2, kthp, getGPA(), absentDays);
        }
}
