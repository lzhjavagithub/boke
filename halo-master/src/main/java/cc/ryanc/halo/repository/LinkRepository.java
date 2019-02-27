package cc.ryanc.halo.repository;

import cc.ryanc.halo.model.domain.Link;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;

/**
 * <pre>
 *     友情链接持久层
 * </pre>
 *
 * @author : RYAN0UP
 * @date : 2017/11/14
 */
public interface LinkRepository extends JpaRepository<Link, Long>, JpaSpecificationExecutor<Link> {
}
