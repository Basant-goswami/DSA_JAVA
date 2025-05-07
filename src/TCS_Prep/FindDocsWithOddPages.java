package TCS_Prep;

import java.util.ArrayList;
import java.util.Scanner;

public class FindDocsWithOddPages {
    public static ArrayList<Document> findOddPagesDocs(Document[] docs){
        ArrayList<Document> ans = new ArrayList<>();
        for(Document d : docs){
            if(d.getPages() % 2 !=0){
                ans.add(d);
            }
        }
        return ans;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Document[] docs = new Document[4];
        for (int i=0;i<4;i++){
            int id = sc.nextInt();
            sc.nextLine();
            String t = sc.nextLine();
            String  f = sc.nextLine();
            int p = sc.nextInt();
            sc.nextLine();
            docs[i] = new Document(id,t,f,p);
        }
        ArrayList<Document> res = findOddPagesDocs(docs);
        for(Document d : res){
            System.out.println(d.getId()+" "+d.getTitle()+" "+d.getFolderName()+" "+d.getPages());
        }
    }
}

class Document{
    int id;
    String title;
    String FolderName;
    int pages;
    public Document(int id,String title,String folderName, int pages){
        this.id = id;
        this.title = title;
        this.FolderName = folderName;
        this.pages = pages;
    }

    public int getId() {
        return id;
    }

    public int getPages() {
        return pages;
    }

    public String getFolderName() {
        return FolderName;
    }

    public String getTitle() {
        return title;
    }
}