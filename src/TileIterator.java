package src;

public class TileIterator {
    Tile[] myTiles;
    public TileIterator(Tile[] tiles) {
        myTiles=tiles;
    }
    public Tile get(int index) {
        return myTiles[index];
    }
}
