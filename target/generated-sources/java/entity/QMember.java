package entity;

import static com.mysema.query.types.PathMetadataFactory.*;

import com.mysema.query.types.path.*;

import com.mysema.query.types.PathMetadata;
import javax.annotation.Generated;
import com.mysema.query.types.Path;


/**
 * QMember is a Querydsl query type for Member
 */
@Generated("com.mysema.query.codegen.EntitySerializer")
public class QMember extends EntityPathBase<Member> {

    private static final long serialVersionUID = 1690149669L;

    public static final QMember member = new QMember("member1");

    public final StringPath memberAddress = createString("memberAddress");

    public final StringPath memberBirth = createString("memberBirth");

    public final StringPath memberEmail = createString("memberEmail");

    public final NumberPath<Integer> memberGrade = createNumber("memberGrade", Integer.class);

    public final StringPath memberHigh = createString("memberHigh");

    public final StringPath memberId = createString("memberId");

    public final StringPath memberLevelCode = createString("memberLevelCode");

    public final NumberPath<Integer> memberMil = createNumber("memberMil", Integer.class);

    public final StringPath memberName = createString("memberName");

    public final StringPath memberPhone = createString("memberPhone");

    public final StringPath memberPw = createString("memberPw");

    public QMember(String variable) {
        super(Member.class, forVariable(variable));
    }

    public QMember(Path<? extends Member> path) {
        super(path.getType(), path.getMetadata());
    }

    public QMember(PathMetadata<?> metadata) {
        super(Member.class, metadata);
    }

}

