package pattern.creational.builder;

import java.util.ArrayList;
import java.util.List;

/*
* The problem with commented code are as follows :
* 1. It will not follow open closed principle if we need to support other export methods.
* 2. Tight coupling between Presentation and Export objects.
* 3. Code duplication like for loop etc.
*
* */
public class Presentation {
    private final List<Slide> slides = new ArrayList<>();

    public void addSlide(Slide slide){
        slides.add(slide);
    }

    public void export(PresentationBuilder presentationBuilder){
        /*if(presentationFormat == PresentationFormat.PDF){
            // representation : based on the export type, we are having different export object type.
            PdfDocument pdfDocument = new PdfDocument();

            // construction : we are creating export object
            for(Slide slide : slides)
                pdfDocument.addPage(slide.getText());
            // Note : builder pattern will separate construction and representation.
        }else if(presentationFormat == PresentationFormat.MOVIE){
            Movie movie = new Movie();
            for(Slide slide : slides)
                movie.addFrame(slide.getText(),3);
        }*/

        // Construction/Integration part separated from each representation or individual components
        // like PDF, movie etc.
        presentationBuilder.addSlide(new Slide("Copyright!"));
        for(Slide slide : slides)
            presentationBuilder.addSlide(slide);

    }
}
