package entity;

import static com.mysema.query.types.PathMetadataFactory.*;

import com.mysema.query.types.path.*;

import com.mysema.query.types.PathMetadata;
import javax.annotation.Generated;
import com.mysema.query.types.Path;


/**
 * QHigh is a Querydsl query type for High
 */
@Generated("com.mysema.query.codegen.EntitySerializer")
public class QHigh extends EntityPathBase<High> {

    private static final long serialVersionUID = 1235131629L;

    public static final QHigh high = new QHigh("high");

    public final NumberPath<Float> highScore = createNumber("highScore", Float.class);

    public final StringPath memberId = createString("memberId");

    public QHigh(String variable) {
        super(High.class, forVariable(variable));
    }

    public QHigh(Path<? extends High> path) {
        super(path.getType(), path.getMetadata());
    }

    public QHigh(PathMetadata<?> metadata) {
        super(High.class, metadata);
    }

}

