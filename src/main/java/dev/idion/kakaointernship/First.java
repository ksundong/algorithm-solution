package dev.idion.kakaointernship;

public class First {
    public String solution(int[] numbers, String hand) {
        Point[] points =
                {new Point(1, 3), new Point(0, 0), new Point(1, 0), new Point(2, 0), new Point(0, 1), new Point(1,
                        1), new Point(2, 1), new Point(0, 2), new Point(1, 2), new Point(2, 2)};
        Point left = new Point(0, 3);
        Point right = new Point(2, 3);
        boolean isRight = hand.equals("right");

        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < numbers.length; i++) {
            int number = numbers[i];
            if (number == 1 || number == 4 || number == 7) {
                sb.append('L');
                left = points[number];
            } else if (number == 3 || number == 6 || number == 9) {
                sb.append('R');
                right = points[number];
            } else {
                int leftDistance = left.getDistance(points[number]);
                int rightDistance = right.getDistance(points[number]);
                if (leftDistance < rightDistance) {
                    sb.append('L');
                    left = points[number];
                } else if (leftDistance > rightDistance) {
                    sb.append('R');
                    right = points[number];
                } else {
                    if (isRight) {
                        sb.append('R');
                        right = points[number];
                    } else {
                        sb.append('L');
                        left = points[number];
                    }
                }
            }
        }

        return sb.toString();
    }

    public class Point {
        int x;
        int y;

        public Point(int x, int y) {
            this.x = x;
            this.y = y;
        }

        public int getDistance(Point dp) {
            return Math.abs(this.x - dp.x) + Math.abs(this.y - dp.y);
        }
    }
}
