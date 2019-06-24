public class VehicleClient{

    public static void main(String args[]){
        GoodsVehicle goodsvehicle = new GoodsVehicle(2700, "TATA", "NANO", "BLACK");
        goodsvehicle.setgoodsVehicle();
        goodsvehicle.OnlyGoods();
        PassangerVehicle passangerVehicle = new PassangerVehicle(15848, "TATA", "nexa", "White");
        passangerVehicle.setpassangerVehicle();
        passangerVehicle.NoOfPassanger();
        LuxaryVehicle luxaryVehicle = new LuxaryVehicle(48466, "Audi", "A8", "RED");
        luxaryVehicle.setLuxaryVehicle();
        luxaryVehicle.NoOfPassanger();
        RacingVehicle racingVehicle = new RacingVehicle(546566, "Bugatti", "Veyron","Black" );
        racingVehicle.setRacingVehicle();
        racingVehicle.NoOfPassmanger();

    }
}