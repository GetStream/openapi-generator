package org.openapitools.codegen.templating.mustache;

import com.samskivert.mustache.Mustache;
import com.samskivert.mustache.Template;

import java.io.IOException;
import java.io.Writer;
import java.util.regex.Pattern;

public class KotlinIdentifierEscapeLambda implements Mustache.Lambda {
    private final Pattern identifierPattern;

    public KotlinIdentifierEscapeLambda() {
        String pattern = "^[A-Z_][\\w]*$";
        identifierPattern = Pattern.compile(pattern);
    }

    @Override
    public void execute(Template.Fragment fragment, Writer writer) throws IOException {
        String id = fragment.execute();
        if (!identifierPattern.matcher(id).matches()) {
            // In Kotlin, we can use identifiers which don't conform
            // to the usual Java-like identifiers with backticks
            writer.write(String.format("`%s`", id));
            return;
        }
        writer.write(id);
    }
}
