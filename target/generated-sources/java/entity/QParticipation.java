package entity;

import static com.mysema.query.types.PathMetadataFactory.*;

import com.mysema.query.types.path.*;

import com.mysema.query.types.PathMetadata;
import javax.annotation.Generated;
import com.mysema.query.types.Path;


/**
 * QParticipation is a Querydsl query type for Participation
 */
@Generated("com.mysema.query.codegen.EntitySerializer")
public class QParticipation extends EntityPathBase<Participation> {

    private static final long serialVersionUID = 337564246L;

    public static final QParticipation participation = new QParticipation("participation");

    public final StringPath memberId = createString("memberId");

    public final StringPath participationName = createString("participationName");

    public final NumberPath<Integer> participationNumber = createNumber("participationNumber", Integer.class);

    public QParticipation(String variable) {
        super(Participation.class, forVariable(variable));
    }

    public QParticipation(Path<? extends Participation> path) {
        super(path.getType(), path.getMetadata());
    }

    public QParticipation(PathMetadata<?> metadata) {
        super(Participation.class, metadata);
    }

}

