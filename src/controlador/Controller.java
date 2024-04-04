
package controlador;

import java.awt.Color;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import views.SystemView;

public class Controller implements MouseListener{
    //instanciamos la vista 
    private SystemView views;
    //agregamos un metodo constructor 

    public Controller(SystemView views) {
        this.views = views;
        //le decimos que busque en esta vista los jLabels
        this.views.jLabelProduct.addMouseListener(this);
        this.views.jLabelPurchases.addMouseListener(this);
        this.views.jLabelCustomers.addMouseListener(this);
        this.views.jLabelEmployers.addMouseListener(this);
        this.views.jLabelSuppliers.addMouseListener(this);
        this.views.jLabelCategories.addMouseListener(this);
        this.views.jLabelReports.addMouseListener(this);
        this.views.jLabelSettings.addMouseListener(this);


    }
    
    //metodos del mouse
    @Override
    public void mouseClicked(MouseEvent e) {
    }

    @Override
    public void mousePressed(MouseEvent e) {
    }

    @Override
    public void mouseReleased(MouseEvent e) {
    }

    @Override
    public void mouseEntered(MouseEvent e) {
        //Si la persona se encuentra encima de una opcion del menu, mostrara la opcion verde   
        if (e.getSource() == views.jLabelProduct) {
            views.jPanelProduct.setBackground(new Color(152, 202, 63));
        } else if (e.getSource() == views.jLabelPurchases) {
            views.jPanelPurchases.setBackground(new Color(152, 202, 63));
        } else if (e.getSource() == views.jLabelCustomers) {
            views.jPanelCustomers.setBackground(new Color(152, 202, 63));
        } else if (e.getSource() == views.jLabelEmployers) {
            views.jPanelEmployers.setBackground(new Color(152, 202, 63));
        } else if (e.getSource() == views.jLabelSuppliers) {
            views.jPanelSuppliers.setBackground(new Color(152, 202, 63));
        } else if (e.getSource() == views.jLabelCategories) {
            views.jPanelCategories.setBackground(new Color(152, 202, 63));
        } else if (e.getSource() == views.jLabelReports) {
            views.jPanelReports.setBackground(new Color(152, 202, 63));
        } else if (e.getSource() == views.jLabelSettings) {
            views.jPanelSettings.setBackground(new Color(152, 202, 63));
        }
    }

    @Override
    public void mouseExited(MouseEvent e) {
        //Si el usuario deja de situarse encima del panel o el label, cambie a color blanco 
        if (e.getSource() == views.jLabelProduct) {
            views.jPanelProduct.setBackground(new Color(255,255,255));
        } else if (e.getSource() == views.jLabelPurchases) {
            views.jPanelPurchases.setBackground(new Color(255,255,255));
        } else if (e.getSource() == views.jLabelCustomers) {
            views.jPanelCustomers.setBackground(new Color(255,255,255));
        } else if (e.getSource() == views.jLabelEmployers) {
            views.jPanelEmployers.setBackground(new Color(255,255,255));
        } else if (e.getSource() == views.jLabelSuppliers) {
            views.jPanelSuppliers.setBackground(new Color(255,255,255));
        } else if (e.getSource() == views.jLabelCategories) {
            views.jPanelCategories.setBackground(new Color(255,255,255));
        } else if (e.getSource() == views.jLabelReports) {
            views.jPanelReports.setBackground(new Color(255,255,255));
        } else if (e.getSource() == views.jLabelSettings) {
            views.jPanelSettings.setBackground(new Color(255,255,255));
        }
    }
    
}
