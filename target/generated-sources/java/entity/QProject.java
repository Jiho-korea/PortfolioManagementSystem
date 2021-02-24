package entity;

import static com.mysema.query.types.PathMetadataFactory.*;

import com.mysema.query.types.path.*;

import com.mysema.query.types.PathMetadata;
import javax.annotation.Generated;
import com.mysema.query.types.Path;


/**
 * QProject is a Querydsl query type for Project
 */
@Generated("com.mysema.query.codegen.EntitySerializer")
public class QProject extends EntityPathBase<Project> {

    private static final long serialVersionUID = -403160082L;

    public static final QProject project = new QProject("project");

    public final StringPath memberId = createString("memberId");

    public final NumberPath<Integer> projectGrade = createNumber("projectGrade", Integer.class);

    public final StringPath projectName = createString("projectName");

    public final NumberPath<Integer> projectNumber = createNumber("projectNumber", Integer.class);

    public QProject(String variable) {
        super(Project.class, forVariable(variable));
    }

    public QProject(Path<? extends Project> path) {
        super(path.getType(), path.getMetadata());
    }

    public QProject(PathMetadata<?> metadata) {
        super(Project.class, metadata);
    }

}

