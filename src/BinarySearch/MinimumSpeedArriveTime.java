package BinarySearch;

public class MinimumSpeedArriveTime {

    // Function to calculate the time taken to travel the distances at a given speed
    private double possible(int[] dist, int speed) {
        double time = 0.0;
        int n = dist.length;

        for (int i = 0; i < n - 1; i++) {
            double t = (double) dist[i] / (double) speed;
            time += Math.ceil(t);
        }

        time += (double) dist[n - 1] / (double) speed;
        return time;
    }

    public int minSpeedOnTime(int[] dist, double hour) {
        int l = 1;
        int r = (int) 1e7;

        int minSpeed = -1;

        while (l <= r) {
            int mid = l + (r - l) / 2;

            if (possible(dist, mid) <= hour) {
                minSpeed = mid;
                r = mid - 1;
            } else {
                l = mid + 1; // need to speed up
            }
        }

        return minSpeed;
    }

}
