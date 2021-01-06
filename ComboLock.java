import java.util.ArrayList;

public class ComboLock {
    private int dial, secret1, secret2, secret3;
    ArrayList<Integer> num;
    private int[] cmb;

    public ComboLock(int secret1, int secret2, int secret3) {
        this.secret1 = secret1;
        this.secret2 = secret2;
        this.secret3 = secret3;
        num = new ArrayList<>();
        cmb = new int[]{secret1, secret2, secret3};
    }

    public void reset() {// reset lock to 0
        dial = 0;
        num = new ArrayList<>();
    }

    public void turnLeft(int ticks) {//turn left
        dial -= ticks;
        if (dial < 0) {
            dial += 40;
        }

        num.add(dial);
    }

    public int getDial() {
        return dial;
    }//gets dial

    public void turnRight(int ticks) {//turn right
        dial += ticks;
        if (dial > 39) {
            dial -= 40;
        }

        num.add(dial);
    }

    public boolean open() {//boolean method to check if lock is open
        int i = 0;
        boolean flag = true;
        while (i < 3) {
            if (num.get(i) != cmb[i]) {
                flag = false;
                break;
            }
            i++;
        }
        return flag;
    }
}
