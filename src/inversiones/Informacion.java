
package inversiones;
import java.util.Scanner;

/**
 *
 * @author josea
 */
public class Informacion {
    private int op; 

    public Informacion() {
    }

    public int getOp() {
        return op;
    }

    public void setOp(int op) {
        this.op = op;
    }
    
    
    public void menu(){
        
        Scanner sc = new Scanner(System.in);
        do {
            System.out.println("Menú:");
            System.out.println("1. Glosario");
            System.out.println("2. Informacion sobre CDT's");
            System.out.println("3. Información sobre Bienes raíces");
            System.out.println("4. Información sobre Criptomonedas");
            System.out.println("5. Volver a atrás");
            System.out.print("Seleccione una opción: ");
            op = sc.nextInt();

            switch (op) {
                case 1 -> infoglosario();
                case 2 -> infocdt();
                case 3 -> infobienes();
                case 4 -> infocripto();
                case 5 -> System.out.println("Volviendo atrás...");
                default -> System.out.println("Opción no válida. Por favor, seleccione una opción válida.");
            }
        } while (op != 5);
    }
    
    
        public void infoglosario(){
            
        Scanner sc = new Scanner(System.in);
        do {
            System.out.println("Menú:");
            System.out.println("   Glosario de iversiones   ");
            System.out.println("   Seleccione una opción:   ");
            System.out.println("         1. A - E");
            System.out.println("         2. F - K");
            System.out.println("         3. L - P");
            System.out.println("         4. Q - U");
            System.out.println("         5. V - Z");
            System.out.print("     6. Volver a atrás");
            op = sc.nextInt();

            switch (op) {
                case 1 -> desdeAhastaE();
                case 2 -> desdeFhastak();
                case 3 -> desdeLhastaP();
                case 4 -> desdeQhastaU();
                case 5 -> desdeVhastaZ();
                case 6 -> System.out.println("Volviendo atrás...");
                default -> System.out.println("Opción no válida. Por favor, seleccione una opción válida.");
            }
        } while (op != 6);
    }

    private void desdeAhastaE(){
        String texto = "Acciones: Representan la propiedad parcial de una empresa.\n" +
        " Los inversores que poseen acciones son propietarios de una\n" +
        " parte de la empresa y pueden recibir dividendos y ganancias\n" +
        " de capital.\n" +
        "Análisis fundamental: Método de evaluación de inversiones que\n" +
        " se basa en el estudio de factores financieros, económicos y\n" +
        " empresariales para determinar el valor intrínseco de un activo.\n" +
        "Análisis técnico: Método de evaluación de inversiones que se\n" +
        " basa en el estudio de gráficos de precios y otros datos del\n" +
        " mercado para predecir futuros movimientos de precios.\n" +
        "Bienes raíces: Inversiones en propiedades físicas, como terrenos\n" +
        " y edificios, con el objetivo de generar ingresos mediante el\n" +
        " alquiler o la apreciación del valor a lo largo del tiempo.\n" +
        "Bonos: Valores de deuda emitidos por gobiernos, corporaciones u\n" +
        " otras entidades. Los inversores que compran bonos prestan dinero\n" +
        " al emisor y reciben pagos periódicos de intereses y el reembolso\n" +
        " del principal al vencimiento.\n" +
        "Capitalización de mercado: Valor total de todas las acciones en\n" +
        " circulación de una empresa, calculado multiplicando el precio de\n" +
        " sus acciones por el número total de acciones.\n" +
        "Deflación: La disminución generalizada y sostenida en el nivel de\n" +
        " precios de bienes y servicios en una economía, lo que puede\n" +
        " resultar en una contracción económica.\n" +
        "Diversificación: Estrategia que consiste en distribuir el capital\n" +
        " en diferentes tipos de activos para reducir el riesgo de pérdida.\n" +
        "Dividendos: Pagos periódicos realizados por una empresa a sus\n" +
        " accionistas como parte de las ganancias obtenidas.";
        System.out.println(texto);
    }    
        
    private void desdeFhastak(){
        String texto = "Fondos cotizados en bolsa (ETFs): Fondos de inversión\n" +
        " que cotizan en bolsa y siguen índices, sectores o\n" +
        " materias primas. Los inversores pueden comprar y vender\n" +
        " ETFs como si fueran acciones.\n" +
        "Fondos de inversión: Vehículos de inversión que agrupan\n" +
        " el dinero de muchos inversores para comprar una cartera\n" +
        " diversificada de activos, como acciones, bonos u otros\n" +
        " valores.\n" +
        "Hedge funds: Fondos de inversión privados que buscan\n" +
        " obtener ganancias utilizando una variedad de estrategias\n" +
        " de inversión, como el apalancamiento, la cobertura y el\n" +
        " arbitraje.\n" +
        "Inflación: El aumento generalizado y sostenido en el nivel\n" +
        " de precios de bienes y servicios en una economía, lo que\n" +
        " reduce el poder adquisitivo del dinero con el tiempo.\n" +
        "Inversión: El acto de destinar recursos financieros a \n" +
        "activos con el objetivo de obtener ganancias futuras.";
        System.out.println(texto);
    }
    
    private void desdeLhastaP(){
        String texto = "Liquidez: La facilidad con la que un activo puede ser\n" +
        " comprado o vendido en el mercado sin afectar\n" +
        " significativamente su precio.\n" +
        "Mercado de valores: Un mercado donde se compran y\n" +
        " venden acciones y otros valores, permitiendo a las\n" +
        " empresas y a los inversores intercambiar capital.\n" +
        "Mercado de divisas: Un mercado global descentralizado\n" +
        " para el comercio de monedas, donde los participantes\n" +
        " pueden comprar, vender, intercambiar y especular sobre\n" +
        " monedas extranjeras.\n" +
        "Mercado primario: Un mercado donde los emisores venden\n" +
        " valores por primera vez para recaudar capital. Los\n" +
        " inversores compran estos valores directamente del emisor.\n" +
        "Mercado secundario: Un mercado donde los inversores\n" +
        " compran y venden valores entre ellos, sin la participación\n" +
        " directa del emisor. La mayoría de las operaciones en el\n" +
        " mercado de valores ocurren en el mercado secundario.\n" +
        "Portafolio: La colección de inversiones que posee un\n" +
        " individuo o una entidad. Un portafolio bien diversificado\n" +
        " puede ayudar a mitigar el riesgo y maximizar los retornos.";
        System.out.println(texto);
    }
    
    private void desdeQhastaU(){
        String texto = "Rentabilidad: El rendimiento o ganancia obtenida de una\n" +
        " inversión, expresada como un porcentaje del capital\n" +
        " invertido.\n" +
        "Riesgo: La posibilidad de que una inversión no genere\n" +
        " los retornos esperados o incluso ocasione pérdidas.\n" +
        " Puede estar relacionado con factores como la volatilidad\n" +
        " del mercado, la falta de liquidez o eventos específicos\n" +
        " de la empresa.\n" +
        "Riesgo crediticio: La posibilidad de que una contraparte\n" +
        " en una transacción financiera no cumpla con sus\n" +
        " obligaciones de pago.";
        System.out.println(texto);
    }
    
    private void desdeVhastaZ(){
        String texto = "Volatilidad: La medida de la variación de los\n" +
        " precios de un activo en el tiempo. Cuanto mayor\n" +
        " sea la volatilidad, mayor será el riesgo\n" +
        " asociado con la inversión.";
        System.out.println(texto);
    }
    
    private void infocdt() {
        String texto = "Los Certificados de Depósito a Término (CDT) son instrumentos financieros\n" +
        " de renta fija ofrecidos por entidades financieras. Aquí tienes información\n" +
        " clave sobre los CDT:\n" +
        "\n" +
        "¿Qué son los CDT?: Un CDT es un producto de ahorro donde el inversor\n" +
        " deposita una cantidad de dinero en una entidad financiera a cambio de\n" +
        " recibir un rendimiento fijo de interés durante un período de tiempo\n" +
        " específico, conocido como plazo.\n" +
        "\n" +
        "Plazos y tasas de interés: Los CDTs están disponibles en una variedad de\n" +
        " plazos, que pueden ir desde unos pocos meses hasta varios años. La tasa\n" +
        " de interés ofrecida por un CDT generalmente aumenta con el plazo de\n" +
        " vencimiento: a mayor plazo, mayor tasa de interés.\n" +
        "\n" +
        "Seguridad: Los CDTs son considerados una forma segura de inversión porque\n" +
        " están respaldados por la entidad financiera emisora y, en muchos países,\n" +
        " están asegurados por sistemas de garantía de depósitos hasta cierto límite.\n" +
        "\n" +
        "Liquidez: A diferencia de otras inversiones, como acciones o fondos de\n" +
        " inversión, los CDTs suelen tener una menor liquidez, ya que el dinero \n" +
        "invertido está comprometido durante el plazo acordado. Sin embargo, \n" +
        "algunos CDTs pueden permitir retiradas anticipadas con una penalización por retiro anticipado.\n" +
        "\n" +
        "Renovación automática: Al vencimiento, los CDTs pueden renovarse\n" +
        " automáticamente por el mismo plazo o por uno diferente, a menos que el\n" +
        " titular del CDT indique lo contrario.\n" +
        "\n" +
        "Impuestos: Los intereses generados por los CDTs suelen estar sujetos a\n" +
        " impuestos sobre la renta, por lo que es importante tener en cuenta este\n" +
        " aspecto al calcular el rendimiento neto de la inversión.\n" +
        "\n" +
        "Diversificación: Los CDTs pueden ser una parte útil de una cartera de\n" +
        " inversiones diversificada, proporcionando estabilidad y previsibilidad\n" +
        " en el rendimiento.\n" +
        "\n" +
        "Comparación de ofertas: Antes de invertir en un CDT, es importante comparar\n" +
        " las tasas de interés ofrecidas por diferentes entidades financieras y\n" +
        " considerar otros factores como la reputación del banco, las políticas\n" +
        " de renovación automática y las opciones de retiro anticipado.";
        System.out.println(texto);
    }

    private void infobienes() {
            String texto = "Las inversiones en bienes raíces pueden ser una excelente forma de hacer crecer\n" +
            " tu patrimonio a largo plazo. Aquí tienes algunas consideraciones y consejos:\n" +
            "\n" +
            "Educación financiera: Antes de empezar, es importante educarse sobre el mercado\n" +
            " inmobiliario, entender los diferentes tipos de inversiones disponibles y\n" +
            " aprender sobre conceptos clave como el retorno de la inversión (ROI), el\n" +
            " flujo de efectivo, la apreciación del valor y los impuestos asociados.\n" +
            "\n" +
            "Define tus objetivos: Decide si estás buscando ingresos pasivos a través de\n" +
            " alquileres, ganancias a largo plazo mediante la apreciación del valor de la\n" +
            " propiedad, o una combinación de ambos.\n" +
            "\n" +
            "Investiga el mercado: Analiza las tendencias del mercado inmobiliario en la\n" +
            " ubicación donde estás considerando invertir. Factores como la oferta y la\n" +
            " demanda, el crecimiento económico, las tasas de desempleo y los planes de\n" +
            " desarrollo urbano pueden influir en la rentabilidad de tu inversión.\n" +
            "\n" +
            "Elige la propiedad adecuada: Busca propiedades que se ajusten a tus objetivos\n" +
            " de inversión y que estén en buenas ubicaciones. Considera el estado de la\n" +
            " propiedad, los costos de mantenimiento, la accesibilidad a servicios y\n" +
            " transporte, y el potencial de crecimiento del valor a largo plazo.\n" +
            "\n" +
            "Financiamiento: Evalúa tus opciones de financiamiento, ya sea a través de\n" +
            " hipotecas, préstamos comerciales u otras fuentes de capital. Calcula\n" +
            " cuidadosamente los costos asociados con el financiamiento y asegúrate\n" +
            " de tener un plan para cubrir los pagos de la hipoteca y otros gastos relacionados.\n" +
            "\n" +
            "Diversificación: No coloques todos tus recursos en una sola propiedad. Considera\n" +
            " diversificar tu cartera de inversiones inmobiliarias para mitigar riesgos y\n" +
            " maximizar el potencial de retorno.\n" +
            "\n" +
            "Gestión adecuada: Si planeas alquilar la propiedad, asegúrate de tener un plan de\n" +
            " gestión de arrendamiento sólido. Esto incluye la selección de inquilinos\n" +
            " confiables, mantenimiento regular de la propiedad y atención oportuna a\n" +
            " cualquier problema que pueda surgir.\n" +
            "\n" +
            "Mantente informado: El mercado inmobiliario puede ser volátil y está sujeto a\n" +
            " cambios económicos y regulatorios. Mantente actualizado sobre las tendencias\n" +
            " del mercado y ajusta tu estrategia de inversión según sea necesario.\n" +
            "\n" +
            "Recuerda que invertir en bienes raíces requiere un compromiso a largo plazo y\n" +
            " diligencia en la investigación y la gestión. Si no estás seguro de por dónde\n" +
            " empezar, considera consultar con un asesor financiero o un profesional\n" +
            " inmobiliario con experiencia.";
            System.out.println(texto);
        }
    private void infocripto() {
            String texto = "las criptomonedas han ganado mucha atención en los últimos años como\n" +
            " una forma alternativa de inversión y medio de intercambio. Aquí\n" +
            " tienes información clave sobre las criptomonedas:\n" +
            "\n" +
            "¿Qué son las criptomonedas?: Las criptomonedas son monedas digitales\n" +
            " descentralizadas que utilizan la criptografía para garantizar la\n" +
            " seguridad de las transacciones y controlar la creación de nuevas\n" +
            " unidades. Bitcoin fue la primera criptomoneda, lanzada en 2009,\n" +
            " pero desde entonces han surgido miles de otras criptomonedas, cada\n" +
            " una con sus propias características y casos de uso.\n" +
            "\n" +
            "Tecnología subyacente: La mayoría de las criptomonedas utilizan la\n" +
            " tecnología blockchain, que es un registro público y descentralizado\n" +
            " de todas las transacciones realizadas con esa criptomoneda. Esta\n" +
            " tecnología proporciona transparencia, seguridad y resistencia\n" +
            " a la censura.\n" +
            "\n" +
            "Volatilidad: Las criptomonedas son conocidas por su alta volatilidad\n" +
            " de precios. Los precios pueden experimentar fluctuaciones\n" +
            " significativas en cortos períodos de tiempo, lo que puede ofrecer\n" +
            " oportunidades de ganancias, pero también conlleva un mayor riesgo\n" +
            " de pérdida.\n" +
            "\n" +
            "Diversificación: Muchos inversores ven las criptomonedas como una\n" +
            " forma de diversificar su cartera de inversiones, ya que tienen una\n" +
            " baja correlación con otros activos tradicionales como acciones y bonos.\n" +
            "\n" +
            "Regulación: La regulación de las criptomonedas varía según el país\n" +
            " y puede tener un impacto significativo en su adopción y uso.\n" +
            " Algunos países han adoptado un enfoque amigable con las criptomonedas,\n" +
            " mientras que otros han impuesto restricciones más estrictas o incluso prohibiciones.\n" +
            "\n" +
            "Seguridad: Aunque la tecnología blockchain es segura, las criptomonedas\n" +
            " todavía pueden ser vulnerables a hackeos y fraudes, especialmente en\n" +
            " plataformas de intercambio poco seguras. Es importante tomar precauciones\n" +
            " de seguridad, como almacenar las criptomonedas en billeteras digitales\n" +
            " seguras y utilizar autenticación de dos factores.\n" +
            "\n" +
            "Educación: Antes de invertir en criptomonedas, es crucial educarse sobre\n" +
            " cómo funcionan, los riesgos asociados y las diferentes criptomonedas disponibles.\n" +
            " La investigación exhaustiva y la comprensión de los fundamentos pueden\n" +
            " ayudarte a tomar decisiones de inversión más informadas.\n" +
            "\n" +
            "Inversión a largo plazo vs. trading: Algunos inversores optan por mantener\n" +
            " sus criptomonedas a largo plazo como una inversión, mientras que otros\n" +
            " participan en el trading activo, tratando de aprovechar las fluctuaciones\n" +
            " de precios a corto plazo. Es importante entender tu estrategia y tolerancia\n" +
            " al riesgo antes de invertir en criptomonedas.";
            System.out.println(texto);
        }
}
