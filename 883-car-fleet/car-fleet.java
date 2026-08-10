class Solution {
    public int carFleet(int target, int[] position, int[] speed) {

        int n = position.length;

        // Sort cars by position in descending order
        TreeMap<Integer, Integer> map =
            new TreeMap<>(Collections.reverseOrder());

        for (int i = 0; i < n; i++) {
            map.put(position[i], speed[i]);
        }

        int i = 0;

        for (Map.Entry<Integer, Integer> entry : map.entrySet()) {
            position[i] = entry.getKey();
            speed[i] = entry.getValue();
            i++;
        }

        int fleets = 0;

        // Time taken by the fleet currently ahead
        double maxTime = 0;

        for (i = 0; i < n; i++) {

            double time =
                (double)(target - position[i]) / speed[i];

            if (time > maxTime) {
                fleets++;
                maxTime = time;
            }
        }

        return fleets;
    }
} /* ai code*/