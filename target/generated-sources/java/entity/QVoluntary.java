package entity;

import static com.mysema.query.types.PathMetadataFactory.*;

import com.mysema.query.types.path.*;

import com.mysema.query.types.PathMetadata;
import javax.annotation.Generated;
import com.mysema.query.types.Path;


/**
 * QVoluntary is a Querydsl query type for Voluntary
 */
@Generated("com.mysema.query.codegen.EntitySerializer")
public class QVoluntary extends EntityPathBase<Voluntary> {

    private static final long serialVersionUID = -2121857611L;

    public static final QVoluntary voluntary = new QVoluntary("voluntary");

    public final StringPath memberId = createString("memberId");

    public final StringPath voluntaryName = createString("voluntaryName");

    public final NumberPath<Integer> voluntaryNumber = createNumber("voluntaryNumber", Integer.class);

    public QVoluntary(String variable) {
        super(Voluntary.class, forVariable(variable));
    }

    public QVoluntary(Path<? extends Voluntary> path) {
        super(path.getType(), path.getMetadata());
    }

    public QVoluntary(PathMetadata<?> metadata) {
        super(Voluntary.class, metadata);
    }

}

