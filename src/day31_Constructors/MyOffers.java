package day31_Constructors;

import java.util.ArrayList;
import java.util.Arrays;

public class MyOffers {

    public static void main(String[] args) {

        offer offer1 = new offer();
        offer1.setInfo("Toronto", "Cydeo", "SDET", 100000.00, true, true, true, true);


        offer offer2 = new offer();
        offer2. setInfo("LA", "Google", "QA", 150000, false, true, true, true);

        offer offer3 = new offer();
        offer3. setInfo("FL", "Apple Inc", "QE",125000, true, true, true, false);

        offer offer4 = new offer();
        offer4.setInfo("TX", "Amazon Inc.", "SM", 115000, true, false, false, true);

        offer offer5 = new offer();
        offer5.setInfo("WA", "Bank Of America","BA",135000,true,true,false,false);

        System.out.println(offer1);
        System.out.println(offer2);
        System.out.println(offer3);
        System.out.println(offer4);
        System.out.println(offer5);

        System.out.println("-------------------------------------------------------------");

        offer[] myOffers = {offer1,offer2,offer3,offer4,offer5};

        ArrayList<offer> fullTimeOffers = new ArrayList<>(Arrays.asList(myOffers));

        fullTimeOffers.removeIf(p -> !p.isFullTime);  // remove if the offer is not full time

        System.out.println(fullTimeOffers.size());

        ArrayList<offer> localOffers = new ArrayList<>(Arrays.asList(myOffers));

        localOffers.removeIf(p -> !p.location.equals("TX"));  // remove if the offer is location is not "TX"

        System.out.println(fullTimeOffers.size());

        ArrayList<offer> offersWithBenefits = new ArrayList<>(Arrays.asList(myOffers));

        offersWithBenefits.removeIf(p -> !p.hasBenefit);  // remove if the offer is not full time

        System.out.println(offersWithBenefits.size());

        ArrayList<offer> sdetOffers = new ArrayList<>(Arrays.asList(myOffers));

        sdetOffers.removeIf(p -> !p.jobTitle.equals("SDET"));  // remove if the offer is not full time

        System.out.println(sdetOffers.size());

        ArrayList<offer> offersWith100K = new ArrayList<>(Arrays.asList(myOffers));

        offersWith100K.removeIf(p -> !(p.salary == 100000));  // remove if the offer is not full time

        System.out.println(offersWith100K.size());




    }
}
/*
2.1 Create 7 objects of Offer
            2.2 Create an array of Offers named myOffers and store all 7 objects of offers
            2.3 Create an ArrayList of Offer named fullTimeOffers and add all the offer objects.
                    2.3.1 Write a program that can remove the offer objects that are not full-time
            2.4 Create an ArrayList of Offer named localOffers and add all the offer objects.
                    2.4.1 Write a program that can remove all the offers that are not from local
            2.5 Create an ArrayList of Offer named offersWithBenefits and add all the offer objects.
                    2.5.1 Write a program that can remove all the offers that does not have benefit and does not have PTO
            2.6 Create an ArrayList of Offer named sdetOffers and add all the offer objects.
                    2.6.1 Write a program that can remove all the offers that are not for SDET
            2.7 Create an ArrayList of Offer named offersWith100K and add all the offer objects.
                    2.7.1 Write a program that can remove all the offers that are offering less than 100K salary
 */