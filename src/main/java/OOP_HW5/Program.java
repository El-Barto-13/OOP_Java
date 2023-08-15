package OOP_HW5;

import OOP_HW5.models.TableModel;
import OOP_HW5.presenters.BookingPresenter;
import OOP_HW5.presenters.Model;
import OOP_HW5.presenters.View;
import OOP_HW5.views.BookingView;

import java.util.Date;

public class Program {

    /**
     * TODO: Домашняя работа
     *  метод changeReservationTable должен заработать!!!
     * @param args
     */
    public static void main(String[] args) {

        View view = new BookingView();
        Model model = new TableModel();

        BookingPresenter bookingPresenter = new BookingPresenter(view, model);
        bookingPresenter.showTables();

        view.reservationTable(new Date(), 3, "Станислав");



        //view.changeReservationTable(1001, new Date(), 4, "Станислав");

    }

}
