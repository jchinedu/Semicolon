package Hardwork;
    public class Problem {
        private Double financial;
        private String spiritual;
        private Double technical;
        private String Education;

    public Problem(double financial, String spiritual, double technical, String Education){
            this.financial = financial;
            this.spiritual = spiritual;
            this.technical = technical;
            this.Education = Education;
    }


    public setfinancial(double amount) {
        if(amount < 0){
            System.out.println("sorry your finances are in trouble");
        }
        this.financial = amount;
        else{
            System.out.println(" kyou are good to go");
        }

    public getfinancial(double amount) {
            return amount;
        }



        }
