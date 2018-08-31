package com.example.maxig.entregable01android;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by DH on 28/5/2018.
 */

public class Hardcodeo {
    public static List<Receta> listadoDeRecetas;

    public static List<Receta> cargarListaDeRecetas() {
        listadoDeRecetas = new ArrayList<>();

        //---------------------------------RECETA 1---------------------------------

        listadoDeRecetas.add(new Receta("Pastelitos", R.drawable.pastelitos,
                //INGREDIENTES
                        "✔ 24 tapas para pastelitos. \n" +
                        "✔ 100 g de dulce de membrillo y/o batata y/o dulce de leche repostero. \n" +
                        "✔ Aceite para freír. \n" +
                        "✔ 100 cc de almíbar.",
                //PREPARACION
                        "1 Colocar un cubo de dulce de membrillo, batata, o dulce de leche en manga, en el centro de cada tapa para pastelitos.\n" + "\n" +
                        "2 Pincelar con agua alrededor del dulce. Cubrir con otro cuadrado de masa sin superponer las puntas.\n" + "\n" +
                        "3 Pellizcar de abajo la masa, presionando en los bordes para cerrar los pastelitos.\n" + "\n" +
                        "4 Freír con abundante aceite o grasa caliente hasta que se doren.\n" + "\n" +
                        "5 Retirar y rociar con el almíbar."));

        //---------------------------------RECETA 2---------------------------------

        listadoDeRecetas.add(new Receta("Pancitos de leche con pastelera", R.drawable.pancitoleche,
                //INGREDIENTES
                "PARA LA ESPONJA\n" + "\n" +
                        "✔ 125 g de harina.\n" +
                        "✔ 100 cc de leche.\n" +
                        "✔ 30 g de levadura.\n" + "\n" +
                "PARA LA MASA\n" + "\n" +
                        "✔ 375 g de harina.\n" +
                        "✔ 100 g de azúcar.\n" +
                        "✔ Una cdta de sal.\n" +
                        "✔ Una cda de miel.\n" +
                        "✔ 2 huevos.\n" +
                        "✔ 100 g de manteca.\n" +
                        "✔ Ralladura de un limón.\n" +
                        "✔ Esencia de vainilla.\n" + "\n" +
                "PARA LA COBERTURA\n" + "\n" +
                        "✔ 150 g de crema pastelera.\n" +
                        "✔ Azúcar granela.\n" +
                        "✔ Almíbar."
                //PREPARACION
                ,"PARA LA ESPONJA\n" + "\n" +
                        "1 Disolver la levadura en la leche y agregar a la harina. Trabajar hasta integrar. Cubrir y dejar duplicar el volumen.\n" + "\n" +
                "PARA EL AMASIJO\n" + "\n" +
                        "1 Realizar una corona. Colocar en el centro la sal, el azúcar, los huevos, la miel y la esencia. Formar un gel. Incorporar la manteca.\n" + "\n" +
                        "2 Agregar la esponja y amasar hasta lograr una masa suave y lisa. Dejar reposar.\n" + "\n" +
                        "3 Realizar los bollos y estibar en placa apenas enharinada.\n" + "\n" +
                        "4 Pintar con huevo batido.\n" + "\n" +
                        "5 Llevar a fermentadora hasta que dupliquen su tamaño.\n" + "\n" +
                        "6 Decorar con la crema pastelera.\n" + "\n" +
                        "7 Hornear a 180° durante 20 minutos.\n" + "\n" +
                        "8 Pintar con almíbar y decorar con el azúcar granela."));

        //---------------------------------RECETA 3---------------------------------

        listadoDeRecetas.add(new Receta("Donuts caseras rellenas", R.drawable.donuts,
                //INGREDIENTES
                        "✔ 400 g de harina 0000.\n" +
                        "✔ 2 cdtas de polvo de hornear.\n" +
                        "✔ Una pizca de sal.\n" +
                        "✔ 30 g de manteca derretida.\n" +
                        "✔ Una yema de huevo.\n" +
                        "✔ 100 cc de leche.\n" +
                        "✔ 100 cc de agua.\n" +
                        "✔ Grana de colores, c/n.\n" + "\n" +
                "PARA EL RELLENO\n" + "\n" +
                        "✔ 200 g de dulce de leche.\n" +
                        "✔ 100 g de chocolate.",
                //PREPARACION
                        "1 Mezclar la leche, la yema, la manteca y el agua en un bowl.\n" + "\n" +
                        "2 Tamizar la harina con el polvo de hornear y la sal. Integrar esta mezcla al bowl.\n" + "\n" +
                        "3 Amasar hasta lograr una masa suave. Dejar reposar 40 minutos tapada con un papel film.\n" + "\n" +
                        "4 Estirar a ½ cm de espesor. Cortar círculos de 10 cm de diámetro, y hacer otro círculo en el centro de unos 4 cm de diámetro.\n" + "\n" +
                        "5 Freír en abundante aceite caliente, dándolas vuelta para que el dorado sea parejo.\n" + "\n" +
                        "6 Cuando estén doradas retirar, dejar enfriar y rellenar.\n" + "\n" +
                        "7 Bañar la mitad con chocolate derretido.\n" + "\n" +
                        "8 Decorar con grana de colores."));

        //---------------------------------RECETA 4---------------------------------

        listadoDeRecetas.add(new Receta("Churro bowl", R.drawable.churro,
                //INGREDIENTES
                "PARA LA MASA\n" + "\n" +
                        "✔ 2 tazas de harina.\n" +
                        "✔ 500 cc de agua.\n" +
                        "✔ 100 g de manteca.\n" +
                        "✔ Una pizca de sal.\n" +
                        "✔ 6 huevos.\n" +
                        "✔ Aceite para freír, c/n.",
                //PREPARACION
                        "1 En una cacerola con agua, hervir el azúcar, la manteca y la sal.\n" + "\n" +
                        "2 Cuando comience a hervir agregar toda la harina de una sola vez y revolver rápidamente con una cuchara de madera hasta que se haga una masa compacta. No se debe pegar a los bordes de la olla.\n" + "\n" +
                        "3 Retirar del fuego e ir integrando con batidora los huevos de a uno.\n" + "\n" +
                        "4 Batir muy bien la preparación para evitar que en la cocción exploten partecitas.\n" + "\n" +
                        "5 Llevar la preparación a una manga y cubrir un bowl invertido, previamente forrado con papel film.\n" + "\n" +
                        "6 Llevar a freezer para que la masa quede bien dura.\n" + "\n" +
                        "7 Freírla en aceite hirviendo con mucho cuidado.\n" + "\n" +
                        "8 Hacer pequeños churros con el resto de la masa.\n" + "\n" +
                        "9 Servir con azúcar, chocolate caliente bien espeso y los churros pequeños dentro del chocolate"));

        //---------------------------------RECETA 5---------------------------------

        listadoDeRecetas.add(new Receta("Pastel de manzanas", R.drawable.pastelmanzana,
                //INGREDIENTES
                        "✔ Manteca.\n" +
                        "✔ 260 g de harina común.\n" +
                        "✔ 3 g de sal.\n" +
                        "✔ 130 g de manteca.\n" +
                        "✔ Un huevo.\n" +
                        "✔ 30 cc de agua.\n" + "\n" +
                "PARA EL RELLENO\n" + "\n" +
                        "4 manzanas rojas.\n" +
                        "2 cdas de azúcar.\n" +
                        "Una cdta de canela.\n" +
                        "3 cdas de manteca derretida.\n" + "\n" +
                "PARA EL GLASEADO\n" + "\n" +
                        "2 cdas de azúcar impalpable.\n" +
                        "Una cda de jugo de limón.",
                //PREPARACION
                        "1 Mezclar en un recipiente harina, azúcar, sal y manteca.\n" + "\n" +
                        "2 Añadir el huevo y agua fría, integrar y continuar uniendo la masa.\n" + "\n" +
                        "3 Hacer un bollo y dejar reposar al menos una hora en la heladera, luego extenderla con la ayuda de un palote sobre una superficie plana enharinada.\n" + "\n" +
                        "4 Colocar sobre un molde enmantecado y enharinado, dejando que sobresalga la masa unos 5 cm aproximadamente.\n" + "\n" +
                        "5 Por otro lado, pelar y cortar las manzanas a la mitad y después en rodajas para colocarlas de forma concéntrica sobre la masa.\n" + "\n" +
                        "6 Doblar los bordes de la masa sobre la manzana y con un pincel pintar la tarta con manteca derretida.\n" + "\n" +
                        "7 Espolvorear una cucharada de azúcar y hornear a 160º durante 45 minutos.\n" + "\n" +
                        "8 Mezclar el azúcar impalpable con el jugo de limón.\n" + "\n" +
                        "9 Cubrir con el glaseado y acompañar con helado de americana (opcional)."));

        //---------------------------------RECETA 6---------------------------------

        listadoDeRecetas.add(new Receta("Alfajores de churros", R.drawable.alfajoreschurros,
                //INGREDIENTES
                "PARA LA MASA\n" + "\n" +
                        "✔ ½ kg de harina 0000.\n" +
                        "✔ ½ l de agua.\n" +
                        "✔ 5 g de sal fina.\n" + "\n" +
                        "PARA LA TERMINACIÓN\n" +
                        "\n" +
                        "✔ Azúcar, c/n.\n" +
                        "✔ Aceite para freír.\n" +
                        "✔ 200 g de dulce de leche repostero.\n" +
                        "✔ Chocolate cobertura negro para decorar.",
                //PREPARACION
                        "1 En una olla hervir el agua con sal, agregar harina y comenzar a mezclar 2 minutos aproximadamente hasta lograr un engrudo, que se despegue de las paredes de la olla.\n" + "\n" +
                        "2 Llevar a una manga con boquilla rizada y en una placa para horno con papel manteca y disponer círculos de 8 cm de diámetro dobre un papel manteca.\n" + "\n" +
                        "3 Llevar al freezer y freír en abundante aceite.\n" + "\n" +
                        "4 Luego de que estén fríos los discos, rellenarlos con dulce de leche y hacerles unas líneas de chocolate."));

        //---------------------------------RECETA 7---------------------------------

        listadoDeRecetas.add(new Receta("Conitos de dulce de leche", R.drawable.conitosdulcedeleche,
                //INGREDIENTES
                        "✔ 250 g de harina 0000.\n" +
                        "✔ 60 g de fécula de maíz.\n" +
                        "✔ 5 g de sal.\n" +
                        "✔ 10 g de cacao en polvo.\n" +
                        "✔ 5 g de polvo de hornear.\n" +
                        "✔ 135 g de manteca.\n" +
                        "✔ 135 g de azúcar.\n" +
                        "✔ 2 huevos.\n" +
                        "✔ 25 g de miel.\n" +
                        "✔ 5 g de esencia de vainilla.\n" +
                        "✔ 5 g de esencia de almendras.\n" +
                        "✔ 500 g de dulce de leche.\n" +
                        "✔ 500 g de chocolate hidrogenado.",
                //PREPARACION
                        "1 Colocar la margarina pomada en la batidora eléctrica con la paleta junto al azúcar.\n" + "\n" +
                        "2 Añadir los huevos, la miel y las esencias.\n" + "\n" +
                        "3 Incorporar todos los ingredientes secos.\n" + "\n" +
                        "4 Unir bien.\n" + "\n" +
                        "5 Estirar la masa.\n" + "\n" +
                        "6 Cortar los discos de 3 cm de diámetro.\n" + "\n" +
                        "7 Hornear a 200° por 10 minutos.\n" + "\n" +
                        "8 Hacer copos de dulce de leche en cada disco.\n" + "\n" +
                        "9 Bañar con el chocolate derretido."));

        //---------------------------------RECETA 8---------------------------------

        listadoDeRecetas.add(new Receta("Chocotorta", R.drawable.chocotorta,
                //INGREDIENTES
                        "✔ 250 g de queso crema.\n" +
                        "✔ 250 g de dulce de leche.\n" +
                        "✔ 500 g de galletitas de chocolate.\n" +
                        "✔ 500 cc de leche.\n" + "\n" +
                "PARA LA CUBIERTA\n" + "\n" +
                        "✔ 100 cc de crema.\n" +
                        "✔ 200 g de chocolate con leche.",
                //PREPARACION
                        "1 Mezclar el queso con el dulce de leche.\n" + "\n" +
                        "2 Mojar las galletitas con la leche.\n" + "\n" +
                        "3 Colocar una capa de galletitas en la base de un molde.\n" + "\n" +
                        "4 Colocar 1/4 del relleno.\n" + "\n" +
                        "5 Repetir la operación tres veces.\n" + "\n" +
                        "6 Llevar al frío.\n" + "\n" +
                        "7 Hervir la crema.\n" + "\n" +
                        "8 Volcarla sobre el chocolate con leche.\n" + "\n" +
                        "9 Cubrir la preparación."));

        //---------------------------------RECETA 9---------------------------------

        listadoDeRecetas.add(new Receta("Cubanitos de dulce de leche", R.drawable.cubanitos,
                //INGREDIENTES
                        "✔ 12 cubanitos.\n" +
                        "✔ 250 g de dulce de leche repostero.\n" +
                        "✔ 250 g de chocolate hidrogenado.\n" +
                        "✔ 50 g de granas de colores.",
                //PREPARACION
                        "1 Rellenar los cubanitos con el dulce de leche repostero.\n" + "\n" +
                        "2 Pasarlos por el chocolate hidrogenado derretido sumergiendo las dos puntas y luego por la grana.\n" + "\n" +
                        "3 Servir."));

        //---------------------------------RECETA 10---------------------------------

        listadoDeRecetas.add(new Receta("Alfajor marplatense", R.drawable.alfajormarplatense,
                //INGREDIENTES
                        "✔ 170 g de harina.\n" +
                        "✔ 4 g de polvo de hornear.\n" +
                        "✔ 8 g de cacao amargo.\n" +
                        "✔ 100 g de azúcar.\n" +
                        "✔ 4 g de bicarbonato de sodio.\n" +
                        "✔ 8 g de bicarbonato de amonio.\n" +
                        "✔ 4 g de sal.\n" +
                        "✔ 100 g de manteca.\n" +
                        "✔ 60 cc de agua.\n" +
                        "✔ 4 cc de esencia de vainilla.\n" +
                        "✔ 300 g de chocolate semi amargo.\n" +
                        "✔ 50 g de manteca de cacao.\n" +
                        "✔ 400 g de dulce de leche repostero.",
                //PREPARACION
                        "1 Procesar la harina, el polvo para hornear, el cacao amargo, el azúcar, los bicarbonatos, la sal y la manteca.\n" + "\n" +
                        "2 Agregar el agua y la esencia de vainilla y seguir procesando.\n" + "\n" +
                        "3 Disponer la pasta sobre papel film, aplastarla un poco y cubrir con el mismo film. Llevar a frío por una hora.\n" + "\n" +
                        "4 Poner el bollo sobre la mesada y amasarlo.\n" + "\n" +
                        "5 Cortar círculos de masa con un molde del tamaño de un alfajor.\n" + "\n" +
                        "6 Llevar a horno a 180° durante 15 minutos.\n" + "\n" +
                        "7 En otro bowl, derretir el chocolate semiamargo con la manteca de cacao a baño maría.\n" + "\n" +
                        "8 Poner una primera capa de dulce de leche repostero sobre cada tapa de masa.\n" + "\n" +
                        "9 Cubrir con una segunda tapa y bañar cada alfajor en chocolate.\n" + "\n" +
                        "10 Disponer cada uno sobre papel transparente en una placa.\n" + "\n" +
                        "11 Retirar excedente de la cobertura con un soplete en frío.\n" + "\n" +
                        "12 Llevar a frío.\n" + "\n" +
                        "13 Servir."));

        return listadoDeRecetas;
    }
}
