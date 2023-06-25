int[] nums = { 11, 22, 33, 44, 55, 66, 77, 88, 99 };
        int min = nums[0];

        for (int i = 1; i < nums.length; i++) {
            if (nums[i] < min) {
                min = nums[i];
            }
        }

        System.out.println("Smallest value: " + min);