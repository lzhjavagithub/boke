package cc.ryanc.halo.repository;

import cc.ryanc.halo.model.domain.Menu;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;

/**
 * <pre>
 *     菜单持久层
 * </pre>
 *
 * @author : RYAN0UP
 * @date : 2018/1/24
 */
public interface MenuRepository extends JpaRepository<Menu, Long>,JpaSpecificationExecutor<Menu> {
}
