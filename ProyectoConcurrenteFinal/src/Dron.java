/**
 * @author Gerardo Miguel Quechol Zarate        201768662
 * @version final 2
 * 
 */

import javax.swing.*;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;
import java.util.concurrent.Semaphore;
public class Dron extends Thread{
    private PanelDron panel;
    private MiX x;
    private MiY y;
    private int newX,bordeX;
    private int newY,bordeY;
    private Semaphore sem;
    private Lock mutex;
    private boolean muerto = false;
    private XYComp xy;
    private IPC ipc;
    Dron (PanelDron panel, MiX x, MiY y, int bordeX, int bordeY, XYComp rc, IPC ipc){
        this.panel = panel;
        this.x = x;
        this.y = y;
        this.newX = 3; 
        this.newY = 3;
        this.bordeX = bordeX;
        this.bordeY = bordeY;
        sem = new Semaphore(1);
        mutex = new ReentrantLock();
        this.xy = rc;
        this.ipc = ipc;
    }
    
    public void run(){
        if (ipc.getIpc()==1){
            //Semaforos
            System.out.println("El algoritmo es: Semaforos, IPC: "+ipc.getIpc());
            while(true){
                try{
                    if(isReinicio()==false)
                    {
                        //sem.acquire();
                        xy.semAcquire();
                            xy.setX(this.x);    //  Coordenadas desde el Recurso Compartido para todxs
                            xy.setY(this.y);
                            this.y.setMiY(xy.getY().getMiY()+newY);
                            this.x.setMiX(xy.getX().getMiX()+newX);
                            xy.semRelease();
                            //Thread.sleep(60);
                            Thread.sleep((int) (Math.random()*40));
                        //sem.release();
                        //xy.semRelease();
                        panel.repaint();
                    }else if(isReinicio()==true){
                        System.out.println("El hilo ha petado");
                        stop();
                        xy.semRelease();
                    }
                }catch(Exception e){
                    e.printStackTrace();
                }

                if(this.x.getMiX() > bordeX){ 
                    this.setNewX(-this.getNewX());
                }
                if(this.y.getMiY() > bordeY){
                    this.setNewY(-this.getNewY()); 
                }
                if(this.x.getMiX() < 0 ){
                    this.setNewX(-this.getNewX());
                }
                if(this.y.getMiY() < 0 ){
                    this.setNewY(-this.getNewY());
                }
            }
        }else if (ipc.getIpc()==2){
            //MUTEX
            System.out.println("El algoritmo es: MUTEX, IPC: "+ipc.getIpc());
            while(true){
                try{
                    if(isReinicio()==false)
                    {
                        //if(mutex.tryLock()){
                            //mutex.lock();
                        //if(xy.tryLock()){
                        xy.mutexLock();
                        try{
                                xy.setX(this.x);    //  Coordenadas desde el Recurso Compartido para todxs
                                xy.setY(this.y);
                                this.y.setMiY(xy.getY().getMiY()+newY); //cambiamos las posiciones que va a usar el panel con el xy
                                this.x.setMiX(xy.getX().getMiX()+newX);
                                //panel.repaint();
                                //Thread.sleep(20);
                                Thread.sleep((int) (Math.random()*40));
                            //mutex.unlock();
                        }finally{
                            xy.mutexUnlock();
                        }
                        //}
                        panel.repaint();    //no es recurso compartido
                    }else if(isReinicio()==true){
                        System.out.println("El hilo ha petado");
                        stop();
                    }
                }catch(Exception e){e.printStackTrace();}

                if(this.x.getMiX() > bordeX){ 
                    this.setNewX(-this.getNewX());
                }
                if(this.y.getMiY() > bordeY){
                    this.setNewY(-this.getNewY()); 
                }
                if(this.x.getMiX() < 0 ){
                    this.setNewX(-this.getNewX());
                }
                if(this.y.getMiY() < 0 ){
                    this.setNewY(-this.getNewY());
                }
            }
        }else if(ipc.getIpc()==3){
            //Monitores
            System.out.println("El algoritmo es: Monitores, IPC: "+ipc.getIpc());
            while(true){
                try{
                    if(isReinicio()==false)
                    {
                        synchronized(xy){
                            xy.setX(this.x);    //  Coordenadas desde el Recurso Compartido para todxs
                            xy.setY(this.y);;
                            this.y.setMiY(xy.getY().getMiY()+newY); //cambiamos las posiciones que va a usar el panel con el xy
                            this.x.setMiX(xy.getX().getMiX()+newX);
                            //panel.repaint();
                            //Thread.sleep(20);
                            Thread.sleep((int) (Math.random()*40));
                        }
                        panel.repaint();
                    }else if(isReinicio()==true){
                        System.out.println("El hilo ha petado");
                        stop();
                    }
                }catch(Exception e){e.printStackTrace();}

                if(this.x.getMiX() > bordeX){ 
                    this.setNewX(-this.getNewX());
                }
                if(this.y.getMiY() > bordeY){
                    this.setNewY(-this.getNewY()); 
                }
                if(this.x.getMiX() < 0 ){
                    this.setNewX(-this.getNewX());
                }
                if(this.y.getMiY() < 0 ){
                    this.setNewY(-this.getNewY());
                }
            }
        }else if(ipc.getIpc()==4){
            //VC
            System.out.println("El algoritmo es: VC, IPC: "+ipc.getIpc());
            while(true){
                try{
                    if(isReinicio()==false)
                    {
                        xy.vcLock();
                        try{
                            xy.vcSignal();
                            xy.setX(this.x);    //  Coordenadas desde el Recurso Compartido para todxs
                            xy.setY(this.y);;
                            this.y.setMiY(xy.getY().getMiY()+newY); //cambiamos las posiciones que va a usar el panel con el xy
                            this.x.setMiX(xy.getX().getMiX()+newX);
                            //panel.repaint();
                            //Thread.sleep(20);
                            Thread.sleep((int) (Math.random()*40));
                        }finally{
                            xy.vcUnlock();
                        }
                        panel.repaint();
                    }else if(isReinicio()==true){
                        System.out.println("El hilo ha petado");
                        stop();
                    }
                }catch(Exception e){e.printStackTrace();}

                if(this.x.getMiX() > bordeX){ 
                    this.setNewX(-this.getNewX());
                }
                if(this.y.getMiY() > bordeY){
                    this.setNewY(-this.getNewY()); 
                }
                if(this.x.getMiX() < 0 ){
                    this.setNewX(-this.getNewX());
                }
                if(this.y.getMiY() < 0 ){
                    this.setNewY(-this.getNewY());
                }
            }
        }
    }
     
    public int getNewX() {
        return newX;
    }
    public void setNewX(int newX) {
        this.newX = newX;
    }
    public int getNewY() {
        return newY;
    }
    
    public void setNewY(int newY) {
        this.newY = newY;
    }    
    public int getBordeX() {
        return bordeX;
    }
    public void setBordeX(int fX) {
        this.bordeX = fX;
    }
    public int getBordeY() {
        return bordeY;
    }
    public void setBordeY(int fY) {
        this.bordeY = fY;
    }
    public boolean isReinicio() {
        return muerto;
    }
    public void setReinicio(boolean muerto) {
        this.muerto = muerto;
    }
}
