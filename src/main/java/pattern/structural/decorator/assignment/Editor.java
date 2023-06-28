package pattern.structural.decorator.assignment;

public class Editor {
    public void openProject(String path) {
        Marker[] artefacts = {
                new Artefact("Main"),
                new Artefact("Demo"),
                new Artefact("EmailClient"),
                new Artefact("EmailProvider"),
        };

        // Decorating base artefact with multiple markers, this is impossible with inheritance.
        artefacts[0] = new MainMarker(new ErrorMarker(artefacts[0]));
        artefacts[2] = new MainMarker(artefacts[2]);

        for (var artefact : artefacts)
            System.out.println(artefact.render());
    }
}
