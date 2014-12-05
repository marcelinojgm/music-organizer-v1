import java.util.ArrayList;

/**
 * A class to hold details of audio files.
 * 
 * @author David J. Barnes and Michael Kölling
 * @version 2011.07.31
 */
public class MusicOrganizer
{
    // An ArrayList for storing the file names of music files.
    private ArrayList<String> files;

    /**
     * Create a MusicOrganizer
     */
    public MusicOrganizer()
    {
        files = new ArrayList<>();
    }

    /**
     * Add a file to the collection.
     * @param filename The file to be added.
     */
    public void addFile(String filename)
    {
        files.add(filename);
    }

    /**
     * Return the number of files in the collection.
     * @return The number of files in the collection.
     */
    public int getNumberOfFiles()
    {
        return files.size();
    }

    /**
     * List a file from the collection.
     * @param index The index of the file to be listed.
     */
    public void listFile(int index)
    {
        if(validIndex(index)) {
            String filename = files.get(index);
            System.out.println(filename);
        }
    }

    /**
     * Remove a file from the collection.
     * @param index The index of the file to be removed.
     */
    public void removeFile(int index)
    {
        if(validIndex(index)) {
            files.remove(index);
        }
    }

    /**
     * chequea que existe el indice introducido
     */

    public void checkIndex(int index)
    {
        int max = this.files.size();
        if (max == 0)
        {
            System.out.println("no elements in Array");
        }
        else if( (index >= max) || index < 0 )
        {
            System.out.println("Error rang 0-" + (max-1));
        }

    }

    /**
     * valida el indice 
     */
    private boolean validIndex(int index)
    {
        boolean valid = false;
        if(index >= 0 && index < files.size())
        {
            valid = true;
        }
        return valid;
    }          
}
