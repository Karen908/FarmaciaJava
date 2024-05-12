
package controlador;

import java.awt.Color;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import static model.EmpleadosDao.direccion;
import static model.EmpleadosDao.email;
import static model.EmpleadosDao.id_empleados;
import static model.EmpleadosDao.nombreCompleto;
import static model.EmpleadosDao.telefono;
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
        this.views.jLabelClientes.addMouseListener(this);
        this.views.jLabelEmployers.addMouseListener(this);
        this.views.jLabelSuppliers.addMouseListener(this);
        this.views.jLabelCategories.addMouseListener(this);
        this.views.jLabelReports.addMouseListener(this);
        this.views.jLabelSettings.addMouseListener(this);
        perfil();
    }
    //Asignar el perfil al usuario
    public void perfil(){
        this.views.txt_ID_Perfil.setText(""+id_empleados);
        this.views.txt_nombre_Perfil.setText(""+nombreCompleto);
        this.views.txt_direc_Perfil.setText(""+direccion);
        this.views.txt_telefono_Perfil.setText(""+telefono);
        this.views.txt_correo_Perfil.setText(""+email);
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
        } else if (e.getSource() == views.jLabelClientes) {
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
        } else if (e.getSource() == views.jLabelClientes) {
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
