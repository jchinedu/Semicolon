 public class AutoPolicyTest {
  public static void main(String[] args) {
   Autopolicy policy1 = new Autopolicy(11111111, "Toyota Camry", "NJ");
   Autopolicy policy2 = new Autopolicy(22222222, "Ford Fusion",  "ME");
    
  
        policyinNoFaultState(policy1);
        policyinNoFaultState(policy2);

 }
   
  public static void policyinNoFaultState(Autopolicy policy) {
       System.out.println("the auto policy");
       System.out.printf("Account #: %d: car: %s:;%nState %s %s a no-fault state%n%n",
                         policy.getAccountNumber(), policy.getMakeAndModel(), policy.getState(),
                         (policy.isNoFaultState() ? "is" : "is not"));

}
 }