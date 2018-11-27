//Noah Hansen, Jack Schierling, Andriy Zazsypkin
//SWE332 Assignment 2 - Loan Class


public class assignment_02 { //Loan Class
  //----------------------------------------------------------------------
  //   public static int months (int principal,
  //                             double annualRate, int monthlyPayment)
  //
  //   Effects:     return the number of months required to pay off
  //                  the principal
  //   Exceptions: - IAE if any parameters are non-positive
  //               - IAE if payment is not sufficiently large
  //
  //-----------------------------------------------------------------------
  public static int months(int principal,
                           double annualRate, int monthlyPayment) {
    if(principal <= 0 || annualRate <= 0 || monthlyPayment <= 0) {
      throw new IllegalArgumentException("Values cannot be non-positive");
    }
    double dPrincipal = principal;
    int count = 0;
    for(;dPrincipal > 0;++count) {
      dPrincipal = dPrincipal * (1 + (annualRate/12)) - monthlyPayment;
      if(dPrincipal >= principal) {
        throw new IllegalArgumentException(
        "Payment is not sufficiently large, will not be able to be paid off."
        );
      }
    }
    return count;
  }
}
