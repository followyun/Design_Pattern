package my;

import java.util.ArrayList;
import java.util.List;

/**
 * 组合模式
 * 示例：javax.el.CompositeELResolver,
 *      org.springframework.cache.support.CompositeCacheManager
 * 组合类
 */
public class CompositeComputer implements Computer {
    private List<Computer> computers = new ArrayList<Computer>();

    public void add(Computer computer) {
        computers.add(computer);
    }

    public void addAll(List<Computer> computers) {
        computers.forEach(computer -> add(computer));
    }

    public void addAll(Computer... computers) {
        for (Computer computer : computers) {
            add(computer);
        }
    }

    @Override
    public void shutdown() {
//        for(Computer computer :computers){
//            computer.shutdown();
//        }
        computers.forEach((computer -> computer.shutdown()));
    }
}
