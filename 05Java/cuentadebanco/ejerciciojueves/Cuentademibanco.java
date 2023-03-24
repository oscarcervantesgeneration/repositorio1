package ejerciciojueves;

public class Cuentademibanco {

	protected float saldo;
	protected int numeroIngresos = 0;
	protected int numeroDeRetiros = 0;
	protected float porcientoTasaAnual;
	protected float comisionMensual = 0;

	public DecimalFormat df = new DecimalFormat("0.00");

	public Cuenta() {
	super();
	}

	public Cuenta(float saldo, float porcientoTasaAnual) {
	super();
	this.saldo = saldo;
	this.porcientoTasaAnual = porcientoTasaAnual;
	}

	public float getSaldo() {
	return saldo;
	}

	public void setSaldo(float saldo) {
	this.saldo = saldo;
	}

	public int getNumeroIngresos() {
	return numeroIngresos;
	}

	public void setNumeroIngresos(int numeroIngresos) {
	this.numeroIngresos = numeroIngresos;
	}

	public int getNumeroDeRetiros() {
	return numeroDeRetiros;
	}

	public void setNumeroDeRetiros(int numeroDeRetiros) {
	this.numeroDeRetiros = numeroDeRetiros;
	}

	public float getPorcientoTasaAnual() {
	return porcientoTasaAnual;
	}

	public void setPorcientoTasaAnual(float porcientoTasaAnual) {
	this.porcientoTasaAnual = porcientoTasaAnual;
	}

	public float getComisionMensual() {
	return comisionMensual;
	}

	public void setComisionMensual(float comisionMensual) {
	this.comisionMensual = comisionMensual;
	}

	public boolean Ingreso(float ingreso) {
	boolean ingresoCorrecto = true;
	if (ingreso < 0) {
	ingresoCorrecto = false;
	} else {
	saldo = saldo + ingreso;
	numeroIngresos++;
	System.out.println("Ingreso de " + ingreso + " € hecho");
	}
	return ingresoCorrecto;
	}

	public boolean Retirar(float retirar) {//Mismo objetivo que en ingreso
	boolean retirarCorrecto = true;
	if (retirar <= 0) {
	retirarCorrecto = false;
	} else if (saldo >= retirar) {
	saldo = saldo - retirar;
	numeroDeRetiros++;
	System.out.println("Retirada de " + retirar + "€ hecho");
	} else {
	System.out.println("Saldo insuficiente, retirada de "+retirar+"€ denegada");
	retirarCorrecto = false;
	}
	return retirarCorrecto;
	}

	public float InteresMensual() {
	comisionMensual = saldo * (porcientoTasaAnual / 12) / 100;
	saldo = saldo - comisionMensual;
	return comisionMensual;
	}

	public void ExtractoMensual() {
	System.out.println("Interes mensual: " + df.format(InteresMensual()) + " €/mes");
	System.out.println("Saldo: " + df.format(saldo) + " €");

	}

	public String Imprimir() {

	System.out.println("Cuenta [saldo= " + df.format(saldo) + " €, numeroIngresos=" + numeroIngresos
	+ ", numeroDeRetiros=" + numeroDeRetiros + ", porcientoTasaAnual=" + df.format(porcientoTasaAnual)
	+ "%, comisionMensual=" + df.format(comisionMensual) + "€]");
	return null;
	}

	@Override
	public String toString() {


	StringBuilder builder = new StringBuilder();
	builder.append("Cuenta [ ");
	if (this instanceof CuentaAhorros) {
	builder.append("Cuenta de Ahorro - Transacciones= ");
	builder.append(numeroDeRetiros + numeroIngresos+", ");
	if (saldo<100 ) {
	builder.append("cuenta inactiva, ");
	}

	}
	if (this instanceof CuentaCorriente) {
	builder.append("Cuenta Corriente - Transacciones= ");
	builder.append(numeroDeRetiros + numeroIngresos+", " );

	}


	builder.append("Numero Ingresos= ");

	builder.append(numeroIngresos);

	builder.append(", Numero Retiros= ");

	builder.append(numeroDeRetiros);

	builder.append(", Saldo= ");

	builder.append(df.format(saldo));

	builder.append("€, TasaAnual= ");

	builder.append(df.format(porcientoTasaAnual));

	builder.append("%, Comision Mensual= ");

	builder.append(df.format(comisionMensual));

	builder.append("€]");

	return builder.toString();
	}



	public class CuentaAhorros extends Cuenta {
	protected boolean cuentaInactiva;

	public CuentaAhorros(float saldo, float porcientoTasaAnual) {
	super(saldo, porcientoTasaAnual);
	this.cuentaInactiva = cuentaInactiva;
	}

	@Override
	public boolean Ingreso(float ingreso) {

	if (cuentaInactiva = saldo < 100) {

	cuentaInactiva=true;
	System.out.println("La cuenta esta inactiva(saldo menor 100€), ingreso no realizado");
	return false;
	} else
	return super.Ingreso(ingreso);
	}

	@Override
	public boolean Retirar(float retirar) {

	if (cuentaInactiva = saldo-retirar < 100) {
	cuentaInactiva=true;
	System.out.println("Solo puede retirar hasta "+(saldo-100)+ " €");
	retirar=0;
	return false;
	}
	return super.Retirar(retirar);
	}

	@Override
	public void ExtractoMensual() {
	// Aqui para calcular el añadido lo he multiplicado por 3/2, porque el 1.5 es double
	if (numeroDeRetiros > 4) {
	saldo = saldo - ((numeroDeRetiros - 4) * 3 / 2);

	System.out.println("Sobrepasa en " + (numeroDeRetiros - 4) + " retiros");
	System.out.println((numeroDeRetiros - 4) + " x 1.5€ = " + df.format(((numeroDeRetiros - 4) * 3 / 2)));
	}
	if (cuentaInactiva = saldo < 100) {//Tenia otra experesion
	cuentaInactiva=true;
	System.out.println("La cuenta esta inactiva(saldo menor 100€)");
	} else {
	cuentaInactiva=false;
	System.out.println("La cuenta esta activa(saldo superior 100€)");
	}

	System.out.println("Numero de retiros:" + numeroDeRetiros);
	super.ExtractoMensual();

	}

	public String ImprimirCA() {
	System.out.println("CuentaAhorros [saldo= " + df.format(saldo) + ", comisionMensual="
	+ df.format(comisionMensual) + ", Transacciones= " + numeroDeRetiros + numeroIngresos + " ( "
	+ numeroDeRetiros + " retiros, " + numeroIngresos + " ingresos" + ")]");
	return null;
	}



	

	public class CuentaCorriente extends Cuenta {
	protected float sobregiro = 0;

	public CuentaCorriente(float saldo, float porcientoTasaAnual) {
	super(saldo, porcientoTasaAnual);
	this.sobregiro = sobregiro;
	}

	public float getSobregiro() {
	return sobregiro;
	}

	public void setSobregiro(float sobregiro) {
	this.sobregiro = sobregiro;
	}

	@Override
	public boolean Ingreso(float ingreso) {

	if (sobregiro > 0) {
	if (ingreso <= sobregiro) {
	System.out.println("Ingreso de: "+ ingreso+" € para pagar sobregiro de "+sobregiro+" €");
	sobregiro = sobregiro - ingreso;
	ingreso = 0;
	System.out.println("Sobregiro actual de: "+ sobregiro+" €,");
	} else {
	System.out.println("Ingreso de: "+ ingreso+" € para pagar sobregiro de "+sobregiro+" €");
	ingreso = ingreso - sobregiro;
	sobregiro = 0;
	System.out.println("Sobregiro actual de: "+ sobregiro+" €,");
	}

	}
	return super.Ingreso(ingreso);
	}

	public boolean Retirar(float retirar) {
	boolean retirarCorrecto = true;
	if (retirar < 0) {
	retirarCorrecto = false;
	} else if (saldo >= retirar) {
	saldo = saldo - retirar;
	numeroDeRetiros++;
	System.out.println("retiro de " + retirar + "€ hecho");
	} else {
	sobregiro=retirar-saldo;
	saldo=0;
	numeroDeRetiros++;
	System.out.println("retiro de " + retirar + "€ hecho"+'\n'+"Sobregiro de: "+sobregiro+" €");
	retirarCorrecto = true;
	}
	return retirarCorrecto;
	}

	@Override
	public void ExtractoMensual() {
	super.ExtractoMensual();
	}

	public String Imprimir() {
	System.out.println("Cuenta Corriente [Sobregiro= " + df.format(sobregiro) + "€, Saldo= " + df.format(saldo)
	+ "€, ComisionMensual= " + df.format(comisionMensual) + ", Transacciones= "
	+ (numeroDeRetiros + numeroIngresos) + " ( " + numeroDeRetiros + " retiros, " + numeroIngresos
	+ " ingresos" + ")]");
	return null;
	}}








	}[/code]
