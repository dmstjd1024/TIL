package doit.answer.ch3;

public class SeqSearchSen {

    static int seqSearchSen(int[] a, int n, int key) {
        int i = 0;

        a[n] = key;

        while (true) {
            if (a[i] == key)
                break;
            i++;
        }
        return i == n ? -1 : i;
    }

    static int seqSearchSen_for(int[] a, int n, int key) {

        int i=0;
        a[n] = key;

        for (i = 0; a[n] != key; i++)
            ;
            return i == n ? -1 : i;
    }


}
