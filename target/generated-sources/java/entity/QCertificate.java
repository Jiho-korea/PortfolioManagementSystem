package entity;

import static com.mysema.query.types.PathMetadataFactory.*;

import com.mysema.query.types.path.*;

import com.mysema.query.types.PathMetadata;
import javax.annotation.Generated;
import com.mysema.query.types.Path;


/**
 * QCertificate is a Querydsl query type for Certificate
 */
@Generated("com.mysema.query.codegen.EntitySerializer")
public class QCertificate extends EntityPathBase<Certificate> {

    private static final long serialVersionUID = -1782265876L;

    public static final QCertificate certificate = new QCertificate("certificate");

    public final StringPath certificateName = createString("certificateName");

    public final NumberPath<Integer> certificateNumber = createNumber("certificateNumber", Integer.class);

    public final StringPath memberId = createString("memberId");

    public QCertificate(String variable) {
        super(Certificate.class, forVariable(variable));
    }

    public QCertificate(Path<? extends Certificate> path) {
        super(path.getType(), path.getMetadata());
    }

    public QCertificate(PathMetadata<?> metadata) {
        super(Certificate.class, metadata);
    }

}

