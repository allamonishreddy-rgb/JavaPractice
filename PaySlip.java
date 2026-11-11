import java.util.Scanner;

class PaySlip {

    int EmpId;
    String EmpName;
    double BP, DA, HRA, CCA, MA, PF, PT, NPS, allowance, deductible, GS, NS;

    void inp() {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter Employee ID: ");
        EmpId = sc.nextInt();

        sc.nextLine();

        System.out.println("Enter Employee name: ");
        EmpName = sc.nextLine();
        System.out.println("Enter your Basic pay: ");
        BP = sc.nextDouble();
    }

    void proc() {
        DA = BP * 0.28;
        HRA = BP * 0.14;
        CCA = 500;
        MA = 1000;

        PF = 3000;
        PT = 200;
        NPS = BP * 0.1;

        allowance = DA + HRA + CCA + MA;
        deductible = PT + PF + NPS;

        GS = BP + allowance;
        NS = GS - deductible;
    }

    void disp() {
        System.out.println("\nEmployee Salary PaySlip: ");
        System.out.println("Employee Number: " + EmpId);
        System.out.println("Employee Name: " + EmpName);
        System.out.println("Basic Pay: " + BP);

        System.out.println("\nAllowances: ");
        System.out.println("DA: " + DA);
        System.out.println("HRA: " + HRA);
        System.out.println("CCA: " + CCA);
        System.out.println("MA: " + MA);
        System.out.println("Total Allowances: " + allowance);

        System.out.println("\nGross Pay: " + GS);

        System.out.println("\nDeductions: ");
        System.out.println("PF: " + PF);
        System.out.println("PT: " + PT);
        System.out.println("NPS: " + NPS);
        System.out.println("Total Deductions: " + deductible);

        System.out.println("\nNet Salary: " + NS);
    }

    public static void main(String[] args) {
        PaySlip p = new PaySlip();
        p.inp();
        p.proc();
        p.disp();
    }
}