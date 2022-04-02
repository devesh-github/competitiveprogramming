package dcp.leetcode;

/**
 * Created by My PC on 2/1/2021.
 */
public class ReachaNumber {

    public int reachNumber(int target) {
        //return steps(0, 0, target);
        return reachTargetHelper(target);
    }

    public int reachNumberHelper(int target) {
        int i=0,prev=0,curr=1,des=0,res=0,res1=0,j=1;
        if(target==0) return 0;
        while(des!=target) {
            res1 = curr + prev;
            prev = curr;
            curr = res1;
            //System.out.println("res1:"+res1+" prev:"+prev+" curr:"+curr);
            i++;
            res=i;
            System.out.println("des:"+des+" add/minus:"+res);
            if(des+res==target) {
                break;
            } else if(Math.abs(des+res+target)<Math.abs(des+res-target)) {
                des = des-res;
            } else {
                des = des+res;
            }
            /*if(des>=0) {
                if(des+res==target) {
                    break;
                } else if(des+res>target) {
                    des = des-res;
                } else {
                    des = des+res;
                }
            } else {
                if(des+res==target) {
                    break;
                } else if(des+res<target) {
                    des = des+res;
                } else {
                    des = des-res;
                }
            }*/
        }
        return i;
    }

    static int steps(int source, int step,int dest) {
        // base cases
        if (Math.abs(source) > (dest))
            return Integer.MAX_VALUE;

        if (source == dest)
            return step;

        // at each point we can go either way

        // if we go on positive side
        int pos = steps(source + step + 1,
                step + 1, dest);

        // if we go on negative side
        int neg = steps(source - step - 1,
                step + 1, dest);

        // minimum of both cases
        return Math.min(pos, neg);
    }

    static int reachTargetHelper(int target)
    {
        // Handling negatives by symmetry
        target = Math.abs(target);

        // Keep moving while sum is smaller
        // or difference is odd.
        int sum = 0, step = 0;

        while (sum < target || (sum - target) % 2
                != 0) {
            step++;
            sum += step;
        }
        return step;
    }

}
