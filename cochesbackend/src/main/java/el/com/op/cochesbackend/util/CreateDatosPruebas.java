package el.com.op.cochesbackend.util;

import el.com.op.cochesbackend.model.Coche;
import el.com.op.cochesbackend.model.Marca;
import el.com.op.cochesbackend.model.Modelo;
import el.com.op.cochesbackend.enums.Color;
import el.com.op.cochesbackend.repositpory.CocheRepository;
import el.com.op.cochesbackend.repositpory.MarcaRepository;
import el.com.op.cochesbackend.repositpory.ModeloRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class CreateDatosPruebas implements CommandLineRunner{

    @Autowired
    MarcaRepository marcaRepository;

    @Autowired
    ModeloRepository modeloRepository;

    @Autowired
    CocheRepository cocheRepository;

    @Override
    public void run(String... args) throws Exception {
        Marca marca1 = new Marca();
        marca1.setNombre("BMW");
        marcaRepository.save(marca1);

        Marca marca2 = new Marca();
        marca2.setNombre("Mercedes");
        marcaRepository.save(marca2);

        //modelos
        Modelo modelo1 = new Modelo();
        modelo1.setNombre("Clase C");
        int uno=1;
        Long unodntro= new Long(uno);
        Marca marcaM1 = marcaRepository.findById(unodntro).orElse(null);
        modelo1.setMarca(marcaM1);
        modeloRepository.save(modelo1);

        Modelo modelo2 = new Modelo();
        modelo2.setNombre("Clase E");
        modelo2.setMarca(marcaM1);
        modeloRepository.save(modelo2);

        Modelo modelo3 = new Modelo();
        modelo3.setNombre("Clase S");
        modelo3.setMarca(marcaM1);
        modeloRepository.save(modelo3);


        Modelo modelo4 = new Modelo();
        modelo4.setNombre("Serie 3");
        int dos=2;
        Long dosdntro= new Long(dos);
        Marca marcaM2 = marcaRepository.findById(dosdntro).orElse(null);
        modelo4.setMarca(marcaM2);
        modeloRepository.save(modelo4);

        Modelo modelo5 = new Modelo();
        modelo5.setNombre("Serie 5");
        modelo5.setMarca(marcaM2);
        modeloRepository.save(modelo5);

        Modelo modelo6 = new Modelo();
        modelo6.setNombre("Serie 7");
        modelo6.setMarca(marcaM2);
        modeloRepository.save(modelo6);

        ////coches///
        Coche coche1 = new Coche();
        coche1.setCambio(false);
        coche1.setColor(Color.GRIS);
        coche1.setKm(100000);
        coche1.setVersion("220d");
        Modelo modeloCo1 = new Modelo();
        int m1=1;
        Long mo1= new Long(m1);
        modeloCo1 = modeloRepository.findById(mo1).orElse(null);
        coche1.setModelo(modeloCo1);
        cocheRepository.save(coche1);

        Coche coche2 = new Coche();
        coche2.setCambio(true);
        coche2.setColor(Color.NEGRO);
        coche2.setKm(200000);
        coche2.setVersion("250 cdi");
        coche2.setModelo(modeloCo1);
        cocheRepository.save(coche2);

        Coche coche3 = new Coche();
        coche3.setCambio(false);
        coche3.setColor(Color.BLANCO);
        coche3.setKm(300000);
        coche3.setVersion("300 d");
        Modelo modeloCo2 = new Modelo();
        int m2=2;
        Long mo2= new Long(m2);
        modeloCo2 = modeloRepository.findById(mo2).orElse(null);
        coche3.setModelo(modeloCo2);
        cocheRepository.save(coche3);

        Coche coche4 = new Coche();
        coche4.setCambio(true);
        coche4.setColor(Color.GRIS);
        coche4.setKm(400000);
        coche4.setVersion("280 cdi");
        coche4.setModelo(modeloCo2);
        cocheRepository.save(coche4);

        Coche coche5 = new Coche();
        coche5.setCambio(false);
        coche5.setColor(Color.NEGRO);
        coche5.setKm(500000);
        coche5.setVersion("s 500");
        Modelo modeloCo3 = new Modelo();
        int m3=3;
        Long mo3= new Long(m3);
        modeloCo3 = modeloRepository.findById(mo3).orElse(null);
        coche5.setModelo(modeloCo3);
        cocheRepository.save(coche5);

        Coche coche6 = new Coche();
        coche6.setCambio(true);
        coche6.setColor(Color.BLANCO);
        coche6.setKm(500000);
        coche6.setVersion("s 350");
        coche6.setModelo(modeloCo3);
        cocheRepository.save(coche6);

        Coche coche7 = new Coche();
        coche7.setCambio(false);
        coche7.setColor(Color.GRIS);
        coche7.setKm(600000);
        coche7.setVersion("320 d");
        Modelo modeloCo4 = new Modelo();
        int m4=4;
        Long mo4= new Long(m4);
        modeloCo4 = modeloRepository.findById(mo4).orElse(null);
        coche7.setModelo(modeloCo4);
        cocheRepository.save(coche7);

        Coche coche8 = new Coche();
        coche8.setCambio(true);
        coche8.setColor(Color.NEGRO);
        coche8.setKm(100000);
        coche8.setVersion("318 d");
        coche8.setModelo(modeloCo4);
        cocheRepository.save(coche8);

        Coche coche9 = new Coche();
        coche9.setCambio(false);
        coche9.setColor(Color.BLANCO);
        coche9.setKm(200000);
        coche9.setVersion("525 i");
        Modelo modeloCo5 = new Modelo();
        int m5=5;
        Long mo5= new Long(m5);
        modeloCo5 = modeloRepository.findById(mo5).orElse(null);
        coche9.setModelo(modeloCo5);
        cocheRepository.save(coche9);

        Coche coche10 = new Coche();
        coche10.setCambio(true);
        coche10.setColor(Color.GRIS);
        coche10.setKm(300000);
        coche10.setVersion("520 d");
        coche10.setModelo(modeloCo5);
        cocheRepository.save(coche10);

        Coche coche11 = new Coche();
        coche11.setCambio(false);
        coche11.setColor(Color.NEGRO);
        coche11.setKm(400000);
        coche11.setVersion("730 d");
        Modelo modeloCo6 = new Modelo();
        int m6=6;
        Long mo6= new Long(m6);
        modeloCo6 = modeloRepository.findById(mo6).orElse(null);
        coche11.setModelo(modeloCo6);
        cocheRepository.save(coche11);

        Coche coche12 = new Coche();
        coche12.setCambio(true);
        coche12.setColor(Color.BLANCO);
        coche12.setKm(500000);
        coche12.setVersion("728 I");
        coche12.setModelo(modeloCo6);
        cocheRepository.save(coche12);
    }
}
