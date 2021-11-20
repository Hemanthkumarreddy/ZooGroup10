package edu.nwmissouri.zoo10group;

/**
 *
 * @author Hemanth Kumar Reddy Pidaparathy
 */
public class Guest extends Visitor {

    public Guest() {
        this.entranceFee = 100;
        this.discount = 0;
        this.groupSize = 1;

        try {
            int a[] = new int[4];
            System.out.println("Access element three :" + a[8]);
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Exception thrown  :" + e);
        } finally {
            System.out.println("Out of the block");
        }
    }

}
