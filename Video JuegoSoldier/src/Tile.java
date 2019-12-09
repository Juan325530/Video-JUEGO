
import javafx.scene.canvas.GraphicsContext;

public class Tile {
	private int x;
	private int y;
	//Parametros dentro de la imagen principal
	private int altoImagen;
	private int anchoImagen;
	private int xImagen;
	private int yImagen;
	private String indiceImagen;
	private int velocidad;
	
	public Tile(int x, int y, int anchoImagen, int altoImagen, int xImagen, int yImagen, String indiceImagen,
			int velocidad) {
		super();
		this.x = x;
		this.y = y;
		this.altoImagen = altoImagen;
		this.anchoImagen = anchoImagen;
		this.xImagen = xImagen;
		this.yImagen = yImagen;
		this.indiceImagen = indiceImagen;
		this.velocidad = velocidad;
	}
	
	public Tile(int tipoTile,int x, int y, String indiceImagen, int velocidad){
		this.x = x;
		this.y = y;
		this.indiceImagen = indiceImagen;
		this.velocidad = velocidad;
		//this.invertir = invertir;
		switch(tipoTile){
			case 1: //JARDIN
				this.altoImagen = 32;
				this.anchoImagen = 32;
				this.xImagen = 0;
				this.yImagen = 0;
			break;
			case 2: //SOLDADO ESPADA
				this.altoImagen = 32;
				this.anchoImagen = 32;
				this.xImagen = 353;
				this.yImagen = 449;
			break;
			case 3: //CALAVERA
				this.altoImagen = 32;
				this.anchoImagen = 32;
				this.xImagen = 161;
				this.yImagen = 257;
			break;
			case 4: //CARCEL
				this.altoImagen = 32;
				this.anchoImagen = 32;
				this.xImagen = 191;
				this.yImagen = 225;
			break;
			case 5: //VENTANA CON JARDIN
				this.altoImagen = 32;
				this.anchoImagen = 32;
				this.xImagen = 513;
				this.yImagen = 289;
			break;
			case 6: //LADRILLOS
				this.altoImagen = 32;
				this.anchoImagen = 32;
				this.xImagen = 350;
				this.yImagen = 97;
			break;
			case 7: //LADRILLOS VERDES 
				this.altoImagen = 32;
				this.anchoImagen = 32;
				this.xImagen =642;
				this.yImagen =33 ;
			break;
			case 8: //FUENTE DE AGUA 
				this.altoImagen = 32;
				this.anchoImagen = 32;
				this.xImagen =565;
				this.yImagen =333;
			break;
			case 9: //COLUMNAS
				this.altoImagen = 32;
				this.anchoImagen = 32;
				this.xImagen =223;
				this.yImagen =449;
			break;
			case 10: //LADRILLOS MANCHADOS EN NEGRO 
				this.altoImagen = 32;
				this.anchoImagen = 32;
				this.xImagen =513;
				this.yImagen =65;
			break;
			case 11: //LADRILLOS CON AGUJEROS 
				this.altoImagen = 32;
				this.anchoImagen = 32;
				this.xImagen =161;
				this.yImagen =353;
			break;
			case 12:
				this.altoImagen = 32;
				this.anchoImagen = 32;
				this.xImagen =100;
				this.yImagen =385 ;
			break;
			case 13: //CASTILLO DERECHO 
				this.altoImagen = 32;
				this.anchoImagen = 32;
				this.xImagen =130;
				this.yImagen =385;
			break;
			case 14: //CARCEL 
				this.altoImagen = 32;
				this.anchoImagen = 32;
				this.xImagen =641;
				this.yImagen = 98;
			break;
			case 15: // PARED CON SANGRE
				this.altoImagen = 32;
				this.anchoImagen = 32;
				this.xImagen =610;
				this.yImagen =609;
			break;
			case 16: // LADRILLOS VERDES PEQUEÑOS 
				this.altoImagen = 32;
				this.anchoImagen = 32;
				this.xImagen =419;
				this.yImagen =385;
			break;
			case 17: // LADRILLOS PEQUEÑOS CON FUENTE 
				this.altoImagen = 32;
				this.anchoImagen = 32;
				this.xImagen =704;
				this.yImagen =321 ;
			break;
			case 18: // LADRILLO normal 
				this.altoImagen = 32;
				this.anchoImagen = 32;
				this.xImagen =256;
				this.yImagen =129 ;
			break;
			case 19: // LADRILLO normal 
				this.altoImagen = 32;
				this.anchoImagen = 32;
				this.xImagen =34;
				this.yImagen =1 ;
			break;
			case 20: // LADRILLO normal 
				this.altoImagen = 32;
				this.anchoImagen = 32;
				this.xImagen =256;
				this.yImagen = 225 ;
			break;
			case 21: // LADRILLO normal 
				this.altoImagen = 32;
				this.anchoImagen = 32;
				this.xImagen =63;
				this.yImagen = 193 ;
			break;
			
			
			
	
		}
	}
	
	public int getX() {
		return x;
	}
	public void setX(int x) {
		this.x = x;
	}
	public int getY() {
		return y;
	}
	public void setY(int y) {
		this.y = y;
	}
	public int getAltoImagen() {
		return altoImagen;
	}
	public void setAltoImagen(int altoImagen) {
		this.altoImagen = altoImagen;
	}
	public int getAnchoImagen() {
		return anchoImagen;
	}
	public void setAnchoImagen(int anchoImagen) {
		this.anchoImagen = anchoImagen;
	}
	public int getxImagen() {
		return xImagen;
	}
	public void setxImagen(int xImagen) {
		this.xImagen = xImagen;
	}
	public int getyImagen() {
		return yImagen;
	}
	public void setyImagen(int yImagen) {
		this.yImagen = yImagen;
	}
	public String getIndiceImagen() {
		return indiceImagen;
	}
	public void setIndiceImagen(String indiceImagen) {
		this.indiceImagen = indiceImagen;
	}
	public int getVelocidad() {
		return velocidad;
	}
	public void setVelocidad(int velocidad) {
		this.velocidad = velocidad;
	}
	
	public void pintar(GraphicsContext graficos) {
			graficos.drawImage(
				Juego.imagenes.get(this.indiceImagen), 
				this.xImagen, this.yImagen, 
				this.anchoImagen, this.altoImagen, 
				this.x--, this.y, //para que los tiles se muevan 
				this.anchoImagen, this.altoImagen
			);
			
			/*
			 * graficos.drawImage(
				Juego.imagenes.get(this.indiceImagen), 
				this.xImagen, this.yImagen, 
				this.anchoImagen, this.altoImagen, 
				this.x + (invertir==-1?70:0), this.y,
				this.anchoImagen*invertir, this.altoImagen
			);*/
		
	}
	
	
	
}

/*
if (condicion)
	verdadero
else 
	falso
	
	
condicion?verdadero:falso;*/