package com.rogueai.janki.ui.parts;

import java.sql.SQLException;
import java.util.List;

import javax.annotation.PostConstruct;

import org.eclipse.jface.layout.GridLayoutFactory;
import org.eclipse.swt.SWT;
import org.eclipse.swt.events.SelectionAdapter;
import org.eclipse.swt.events.SelectionEvent;
import org.eclipse.swt.widgets.Button;
import org.eclipse.swt.widgets.Composite;

import com.rogueai.janki.core.persistence.dao.factory.DaoFactory;
import com.rogueai.janki.core.persistence.entity.Card;
import com.rogueai.janki.core.persistence.entity.Collection;
import com.rogueai.janki.core.persistence.entity.Grave;
import com.rogueai.janki.core.persistence.entity.Note;
import com.rogueai.janki.core.persistence.entity.Revlog;

/**
 * 
 * @author matsuleode
 * 
 */
public class JAnkiPart {

	@PostConstruct
	public void createPartControl(Composite parent) {

		Composite container = new Composite(parent, SWT.BORDER);
		container.setLayout(GridLayoutFactory.swtDefaults().numColumns(5).create());

		createButtons(container);
	}

	private void createButtons(Composite parent) {
		Button colButton = new Button(parent, SWT.PUSH);
		colButton.setText("Load 'col'");
		colButton.addSelectionListener(new SelectionAdapter() {
			@Override
			public void widgetSelected(SelectionEvent e) {
				try {
					List<Collection> result = DaoFactory.INSTANCE.getCollectionDao().queryForAll();
					System.out.println("Col: " + result.size());
				} catch (SQLException e1) {
					e1.printStackTrace();
				}
			}
		});

		Button notesButton = new Button(parent, SWT.PUSH);
		notesButton.setText("Load 'notes'");
		notesButton.addSelectionListener(new SelectionAdapter() {
			@Override
			public void widgetSelected(SelectionEvent e) {
				try {
					List<Note> result = DaoFactory.INSTANCE.getNoteDao().queryForAll();
					System.out.println("Note: " + result.size());
				} catch (SQLException e1) {
					e1.printStackTrace();
				}
			}
		});

		Button cardsButton = new Button(parent, SWT.PUSH);
		cardsButton.setText("Load 'cards'");
		cardsButton.addSelectionListener(new SelectionAdapter() {
			@Override
			public void widgetSelected(SelectionEvent e) {
				try {
					List<Card> result = DaoFactory.INSTANCE.getCardDao().queryForAll();
					System.out.println("Card: " + result.size());
				} catch (SQLException e1) {
					e1.printStackTrace();
				}
			}
		});

		Button revlogButton = new Button(parent, SWT.PUSH);
		revlogButton.setText("Load 'revlog'");
		revlogButton.addSelectionListener(new SelectionAdapter() {
			@Override
			public void widgetSelected(SelectionEvent e) {
				try {
					List<Revlog> result = DaoFactory.INSTANCE.getRevlogDao().queryForAll();
					System.out.println("Revlog: " + result.size());
				} catch (SQLException e1) {
					e1.printStackTrace();
				}
			}
		});

		Button gravesButton = new Button(parent, SWT.PUSH);
		gravesButton.setText("Load 'graves'");
		gravesButton.addSelectionListener(new SelectionAdapter() {
			@Override
			public void widgetSelected(SelectionEvent e) {
				try {
					List<Grave> result = DaoFactory.INSTANCE.getGraveDao().queryForAll();
					System.out.println("Grave: " + result.size());
				} catch (SQLException e1) {
					e1.printStackTrace();
				}
			}
		});
	}

}
