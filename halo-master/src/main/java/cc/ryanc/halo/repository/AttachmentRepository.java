package cc.ryanc.halo.repository;

import cc.ryanc.halo.model.domain.Attachment;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;

/**
 * <pre>
 *     附件持久层
 * </pre>
 *
 * @author : RYAN0UP
 * @date : 2018/1/10
 */
public interface AttachmentRepository extends JpaRepository<Attachment, Long>,JpaSpecificationExecutor<Attachment> {
}
