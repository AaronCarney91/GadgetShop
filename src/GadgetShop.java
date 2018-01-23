/**
 * Created by u1264377 on 18/01/2018.
 */
public class GadgetShop {

    private static final double WIDGET_PRICE = 1.69;
    private static final double GADGET_PRICE = 2.12;
    private static final double VAT_RATE = 0.175;
    private static final double POSTAGE = 2.50;
    private static final double WIDGET_SUP = 0.10;
    private static final double GADGET_SUP = 0.08;
    private double totalPostage = 0;
    private double totalPrice = 0;
    private double totalVat = 0;
    private double totalWidgetPrice = 0;
    private double totalGadgetPrice = 0;
    private int widgets = 0;
    private int gadgets = 0;

    public GadgetShop(int w, int g)
    {
        widgets = w;
        gadgets = g;

    }

    public double calcVat()
    {
        double vat = 0;
        vat = widgets * VAT_RATE;

        return vat;
    }

    public double widgetTotal()
    {
        double widTotal = 0;
        widTotal = (widgets * WIDGET_PRICE) + calcVat();

        return widTotal;
    }


    public static void main(String[] args)
    {
        GadgetShop gs = new GadgetShop(2, 3);
        System.out.println("Widgets: " + gs.widgets + ", Price: " + gs.widgetTotal() + "n/");
    }


}