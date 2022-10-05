package org.example.entity;

import java.util.*;

public class BasketRepository {
    private ArrayList<Ball> balls = new ArrayList<>();

    public BasketRepository(Ball... balls) {
        this.balls = new ArrayList<>(Arrays.asList(balls)) {


            public List<Ball> getBalls() {
                return balls;
            }

            public void setBall(Ball ball) {
                balls.add(ball);
            }

            public List<Ball> query(Specification specification) {
                List<Ball> resBalls = new ArrayList<>();
                for (Ball ball : balls) {
                    if (specification.specify(ball)) {
                        resBalls.add(ball);
                    }
                }
                return resBalls;
            }

            public void sort(Comparator<Ball>) {
                balls.sort(comparator);
            }


            @Override
            public String toString() {
                return new StringJoiner(", ", BasketRepository.class.getSimpleName() + "[", "]")
                        .add("balls=" + balls)
                        .toString();
            }
        }
    }



    public List<Ball> querry(Specification specification) {
        List<Ball> resBalls = new ArrayList<>();
        for (Ball ball : balls) {
            if (specification.specify(ball)) {
                resBalls.add(ball);
            }
        }
    }
}
