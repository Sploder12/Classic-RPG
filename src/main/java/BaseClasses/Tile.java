package BaseClasses;

import Entities.*;
import java.util.*;

public class Tile {

    public Position pos;
    public boolean passable;
    private ArrayList<Entity> listOfEntities;
    public int tileID = 0;

    /**
     * Puts an arrayList of entities on to a tile. Note: This function does not add entities to a tile.
     * It WILL overwrite the existing array list.
     * @param listOfEntities - An ArrayList of entities.
     */
    public void setEntities(ArrayList<Entity> listOfEntities){
        this.listOfEntities = listOfEntities;
    }

    /**
     * Returns a list of entities on this tile.
     * @return - The List of Entities on this tile.
     */
    public ArrayList<Entity> getEntities(){
        return this.listOfEntities;
    }


    public Tile(ArrayList<Entity> entities){
        pos = null;
        this.listOfEntities = entities;
    }

    public Tile(){
        pos = null;
        this.listOfEntities = new ArrayList<>();
    }

    public Tile(Region region, int X, int Y){
        pos = new Position(region, X, Y);
        this.listOfEntities = new ArrayList<>();
    }

    public Tile(Position pos_arg){
        pos = pos_arg;
        this.listOfEntities = new ArrayList<>();
    }

    public Tile(Region region, int X, int Y, ArrayList<Entity> entities){
        pos = new Position(region, X, Y);
        this.listOfEntities = entities;
    }

    public Tile(Position pos_arg, ArrayList<Entity> entities){
        pos = pos_arg;
        this.listOfEntities = entities;
    }

    /**
     * Checks to see if the tile is the same tile in memory address.
     * @param o - This is the tile we are checking.
     * @return - A boolean of either true or false depending on the tile is the same in memory.
     */
    @Override
    public boolean equals(Object o){
        if (this == o) return true;

        if (!(o instanceof Tile)) return false;

        Tile other = (Tile)(o);

        return this.pos == other.pos;
    }

    /**
     * Adds an entity to an already existing tile entity list.
     * @param nE - The new Entity that is being added to the list.
     */
    public void addEntity(Entity nE){
        listOfEntities.add(nE);
    }

    /**
     * Returns X and Y coordinates for this tile.
     * @return - An Int that represents its coordinate position.
     * NOTE: THIS WILL RETURN 0 IF NO POSITION IS GIVEN TO TILE.
     */

    public int getPositionX(){
        if(this.pos == null){return 0;}
        else{return this.pos.getX();}

    }

    public int getPositionY(){
        if(this.pos == null){return 0;}
        else{return this.pos.getY();}
    }

    /**
     *
     * @return - A region, unless the region does not exist for this tile, in which case it will return null.
     */
    public Region getRegion(){
        return this.pos.getRegion();
    }

    /**
     * Sets a new position for X and Y for the tile.
     *
     */
    public void setPositionX(int x){
        this.pos.setX(x);
    }

    public void setPositionY(int y){
        this.pos.setY(y);
    }

    /**
     * Sets both position X and Y for this tile.
     */
    public void setPositionXY(int x, int y){
        this.pos.setXY(x, y);
    }

    /**
     * Sets a new region for this tile.
     * @param reg - a region object.
     */
    public void setRegion(Region reg){
        this.pos.setRegion(reg);
    }

    /**
     *
     * @param pos - Sets a position object to this tile.
     */
    public void setPosition(Position pos){
        this.pos = pos;
    }

    /**
     *
     * @return isPassable - returns if the tile is passage
     */
    public boolean isPassable(){
        return passable;
    }


}