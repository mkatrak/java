package fi.ixonos.projects.logic;

import org.junit.Test;

/**
 *
 * @author katrami
 */
public interface TestInterface {

    @Test
     void testInsert();

    @Test
     void testUpdate();

    @Test
     void testLoad();

    @Test
     void testDelete();
}
