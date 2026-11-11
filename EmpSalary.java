
import java.util.Scanner;


class Employee {
    int empNo;
    String empName;
    double basicPay;

    double hra, da, ma, cca;
    double pf, pt, nps;
    double allowances, deductions;
    double grossPay, netPay;

    Scanner sc = new Scanner(System.in);


    void inp() {
        System.out.print("Enter Employee Number: ");
        empNo = sc.nextInt();

        sc.nextLine();

        System.out.print("Enter Employee Name: ");
        empName = sc.nextLine();

        System.out.print("Enter Basic Pay: ");
        basicPay = sc.nextDouble();
    }


    void proc() {

        hra = basicPay * 14 / 100;
        da = basicPay * 28 / 100;
        ma = 1000;
        cca = 500;

        allowances = hra + da + ma + cca;


        grossPay = basicPay + allowances;


        pf = 3000;
        pt = 200;
        nps = basicPay * 10 / 100;

        deductions = pf + pt + nps;


        netPay = grossPay - deductions;
    }


    void disp() {
        System.out.println("\n----- EMPLOYEE SALARY PAYSLIP -----");

        System.out.println("Employee Number : " + empNo);
        System.out.println("Employee Name   : " + empName);
        System.out.println("Basic Pay       : " + basicPay);

        System.out.println("\n----- ALLOWANCES -----");
        System.out.println("HRA             : " + hra);
        System.out.println("DA              : " + da);
        System.out.println("MA              : " + ma);
        System.out.println("CCA             : " + cca);
        System.out.println("Total Allowances: " + allowances);

        System.out.println("\nGross Pay       : " + grossPay);

        System.out.println("\n----- DEDUCTIONS -----");
        System.out.println("PF              : " + pf);
        System.out.println("PT              : " + pt);
        System.out.println("NPS             : " + nps);
        System.out.println("Total Deductions: " + deductions);

        System.out.println("\nNet Salary      : " + netPay);
    }
}


class EmpSalary {
    public static void main(String[] args) {
        Employee e = new Employee();

        e.inp();
        e.proc();
        e.disp();
    }
}
