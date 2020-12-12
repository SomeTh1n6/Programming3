package com;

public class Tunnel extends Place{

    public String getName(){
        return this.getName();
    }

    public static class Darkness implements Absolute{
        private final String Name = "Темнота";

        public String getName() {
            return this.Name;
        }

        public String Dissipated(Flashlight flashlight){
            if (flashlight.getStatusNow() == FlashlightStatusNow.ON){
                return (this.getName() + " рассеялась");
            }
            else {
                return (this.getName() + " сгустилась");
            }
        }

        @Override
        public String Absolute() {
            return ("абсолютная " + getName());
        }
    }

    public static class Bottom implements Falls{
        private String Name;

        public void setName(String name) {
            this.Name = name;
        }

        public String getName() {
            return this.Name;
        }

        @Override
        public void Falls() {
            double steps = (Math.random() * (15.0 - 1.0) + 1.0);
            System.out.println(getName() + " "  + " понижается на " + Double.toString(steps) + " сантиметров: " );
        }
    }

    public static class Wall implements Movement{
        private final String Name = "Стена";
        private ConditionWall conditionWall;
        private StatusWall statusWall;

        public Wall(ConditionWall conditionWall, StatusWall statusWall){
            this.conditionWall = conditionWall;
            this.statusWall = statusWall;
        }

        public void changeStatusWall(StatusWall statusWall){
            this.statusWall = statusWall;
        }


        public void changeCondiditionWalls(ConditionWall conditionWall){
            this.conditionWall = conditionWall;
        }

        public String getName(){
            return this.Name;
        }

        @Override
        public void goAhead() {
            System.out.println(this.conditionWall.getConditionWall() + " " + this.statusWall.getStatusWall() + " " + this.getName() + " движется " + "вперед ");
        }

        @Override
        public void goBack() {
            System.out.println(this.conditionWall.getConditionWall() + " " + this.statusWall.getStatusWall() + " " + this.getName() + " движется " + "назад");
        }

        @Override
        public void goLeft() {
            System.out.println(this.conditionWall.getConditionWall() + " " + this.statusWall.getStatusWall() + " " + this.getName() + " движется " + "влево");
        }

        @Override
        public void goRight() {
            System.out.println(this.conditionWall.getConditionWall() + " " + this.statusWall.getStatusWall() + " " + this.getName() + " движется " + "вправо");
        }

    }


}
